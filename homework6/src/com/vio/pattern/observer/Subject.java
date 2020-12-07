package src.com.vio.pattern.observer;


public interface Subject {

    void attachUpdateObserver(UpdateObserver observer);

    void detachUpdateObserver(UpdateObserver observer);

    void updateChildren(String updateMessage);

    void attachHistoryObserver(HistoryObserver observer);

    void detachHistoryObserver(HistoryObserver observer);

    void addHistoryMessage(String historyMessage);
}
