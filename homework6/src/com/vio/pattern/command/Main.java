package src.com.vio.pattern.command;

public class Main {

    public static void main(String[] args) {

        Operation turnOnLights = new TurnOnLights();
        turnOnLights.executeOperation();

        Operation turnVolumeUp = new TurnVolumeUp();
        turnVolumeUp.executeOperation();

        Operation turnOffLights = new TurnOffLights();
        turnOffLights.executeOperation();

    }
}
