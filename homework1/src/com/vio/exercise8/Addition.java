package com.vio.exercise8;

public record Addition(Integer field1, Integer field2) extends {

    public static Integer calculateResult(Integer field1, Integer field2) {
        return field1 + field2;
    }
}
