package com.vio.exercise3;

import com.vio.utils.Utils;

public class Main3 {

    public static void main(String[] args) {
        var result = Utils.randomOptionalGenerator();

        result.ifPresentOrElse((randomValue) -> System.out.println("value of result " + randomValue),
                () -> System.out.println("You’ve reached the end of INT"));
    }
}
