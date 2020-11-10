package src.com.vio.exercise8;

import src.com.vio.utils.Utils;

public class Main8 {

    public static void main(String[] args) {
        MathematicalOperation additionOperation = new Addition(3, 7);
        MathematicalOperation subtrationOperation = new Subtraction(9, 2);

        MathematicalOperation additionOperation1 = new Addition(10, 5);
        MathematicalOperation subtrationOperation1 = new Subtraction(6, 1);

        System.out.println("are additionOperation and subtrationOperation identical ? : " + Utils.checkOperationTypes(additionOperation, subtrationOperation));
        System.out.println("are additionOperation1 and subtrationOperation identical ? : " + Utils.checkOperationTypes(additionOperation1, subtrationOperation));
        System.out.println("are additionOperation and additionOperation1 identical ? : " + Utils.checkOperationTypes(additionOperation, additionOperation1));
        System.out.println("are subtrationOperation and subtrationOperation1 identical ? : " + Utils.checkOperationTypes(subtrationOperation, subtrationOperation1));


    }
}
