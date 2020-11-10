package src.com.vio.exercise8;

public record Addition(Integer field1, Integer field2) implements MathematicalOperation {

    @Override
    public Integer computeResult() {
        return field1 + field2;
    }
}
