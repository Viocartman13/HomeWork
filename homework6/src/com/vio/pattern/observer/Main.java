package src.com.vio.pattern.observer;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        BusyObject busyObject = new BusyObject();
        busyObject.setName("my busy object :D");
        busyObject.setCreationDate(LocalDateTime.now());
        busyObject.setId(1);

        MyObserverImpl observer1 = new MyObserverImpl("Observer 1 ");
        MyObserverImpl observer2 = new MyObserverImpl("Observer 2");
        MyObserverImpl observer3 = new MyObserverImpl("Observer 3");

        busyObject.attach(observer1);
        busyObject.attach(observer2);

        busyObject.updateObjectAndDependencies("busy object updated", LocalDateTime.now());

        busyObject.detach(observer1);
        busyObject.attach(observer3);

        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime changedLocalDateTime = timeNow.plusHours(4);
        busyObject.updateObjectAndDependencies("busy object updated second time", changedLocalDateTime);
    }
}
