package src.com.vio.exercise2;

import src.com.vio.utils.Utils;

import java.util.NoSuchElementException;

public class Main2 {


    public static void main(String[] args) {
        var result = Utils.randomOptionalGenerator();

        if (result.isEmpty()) {
            throw new NoSuchElementException();
        }
    }


}
