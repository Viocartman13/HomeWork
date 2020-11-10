package src.com.vio.exercise8;

public sealed interface MathematicalOperation permits Addition, Subtraction {

    Integer computeResult();
}
