package com.vio.exercise6;

import com.vio.utils.Utils;

import java.util.HashMap;
import java.util.Map;

public class Main6 {

    public static void main(String[] args) {
        Map<String, String> values = new HashMap<>();
        values.put("name", "Test name");
        values.put("greeting", "Test greeting");

        Utils.generateViewTemplate(values);
    }
}
