package src.com.vio.pattern.observer;

public class UpdateObserverImpl implements UpdateObserver {

    private String name;

    public UpdateObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(String message) {
        System.out.println("Observer with name " + this.name + " received the following message : ");
        System.out.println(message);
    }
}
