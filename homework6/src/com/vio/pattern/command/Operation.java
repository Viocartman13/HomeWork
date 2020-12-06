package src.com.vio.pattern.command;

public sealed interface Operation permits TurnOffLights, TurnOnLights, TurnVolumeUp {

    void executeOperation();
}
