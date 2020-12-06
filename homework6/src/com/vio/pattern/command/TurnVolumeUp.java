package src.com.vio.pattern.command;

public final class TurnVolumeUp implements Operation {

    @Override
    public void executeOperation() {
        System.out.println("The volume has been turned up");
    }
}
