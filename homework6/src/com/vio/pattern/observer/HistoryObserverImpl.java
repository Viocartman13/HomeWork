package src.com.vio.pattern.observer;

public class HistoryObserverImpl implements HistoryObserver {

    @Override
    public void subscribe(String message) {
        System.out.println("Adding update history for following object: ");
        System.out.println(message);
    }
}
