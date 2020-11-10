package src.com.vio.exercise4;

import src.com.vio.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class Main4 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(15);
        values.add(70);
        values.add(99);
        values.add(101);
        values.add(2);

        System.out.println("The difference between the highest and lowest number in this list " + values);
        System.out.println(" is " + Utils.differenceCalculator(values));
    }
}
