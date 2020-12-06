package src.com.vio.pattern.command;

public final class TurnOnLights implements Operation {

    @Override
    public void executeOperation() {
        System.out.println("The lights are on");
    }
}
