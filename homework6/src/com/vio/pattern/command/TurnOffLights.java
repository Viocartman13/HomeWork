package src.com.vio.pattern.command;

public final class TurnOffLights implements Operation {

    @Override
    public void executeOperation() {
        System.out.println("The lights are off");
    }
}
