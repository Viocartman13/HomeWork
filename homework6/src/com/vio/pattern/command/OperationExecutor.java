package src.com.vio.pattern.command;

public class OperationExecutor {

    private Operation operation;

    public OperationExecutor(Operation operation) {
        this.operation = operation;
    }

    public void execute() {
        System.out.println("Executing operation");
        operation.executeOperation();
    }
}
