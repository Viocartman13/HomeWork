package src.com.vio.pattern.observer;


public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void updateChildren(String updateMessage);

}
