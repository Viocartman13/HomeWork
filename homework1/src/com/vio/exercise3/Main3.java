package com.vio.exercise3;

import com.vio.utils.Utils;

public class Main3 {

    public static void main(String[] args) {
        var result = Utils.randomOptionalGenerator();

        if (!result.isEmpty()) {
            System.out.println("value of result: " + result.get());
        } else {
            System.out.println("You’ve reached the end of INT");
        }
    }
}
