package src.com.vio.pattern.observer;


public interface Subject {

    public void attach(MyObserver observer);

    public void detach(MyObserver observer);

    public void updateChildren(String addHistoryMessage);
}
