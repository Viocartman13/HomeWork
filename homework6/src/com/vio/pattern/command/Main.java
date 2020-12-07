package src.com.vio.pattern.command;

public class Main {

    public static void main(String[] args) {

        OperationExecutor operationExecutor;

        operationExecutor = new OperationExecutor(new TurnOnLights());
        operationExecutor.execute();

        operationExecutor = new OperationExecutor(new TurnOffLights());
        operationExecutor.execute();

        operationExecutor = new OperationExecutor(new TurnVolumeUp());
        operationExecutor.execute();

    }
}
