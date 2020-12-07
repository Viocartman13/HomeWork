package src.com.vio.pattern.observer;

public class MyObserverImpl implements MyObserver {

    private String name;

    public MyObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(String message) {
        System.out.println("Observer with name " + this.name + " received the following message : ");
        System.out.println(message);
    }
}
