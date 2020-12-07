package src.com.vio.pattern.observer;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        BusyObject busyObject = new BusyObject();
        busyObject.setName("my busy object :D");
        busyObject.setCreationDate(LocalDateTime.now());
        busyObject.setId(1);

        UpdateObserverImpl observer1 = new UpdateObserverImpl("Observer 1 ");
        UpdateObserverImpl observer2 = new UpdateObserverImpl("Observer 2");
        UpdateObserverImpl observer3 = new UpdateObserverImpl("Observer 3");
        HistoryObserverImpl historyObserver = new HistoryObserverImpl();

        busyObject.attachUpdateObserver(observer1);
        busyObject.attachUpdateObserver(observer2);
        busyObject.attachHistoryObserver(historyObserver);

        busyObject.updateObjectAndDependencies("busy object updated", LocalDateTime.now());

        busyObject.detachUpdateObserver(observer1);
        busyObject.attachUpdateObserver(observer3);

        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime changedLocalDateTime = timeNow.plusHours(4);
        busyObject.updateObjectAndDependencies("busy object updated second time", changedLocalDateTime);
    }
}
