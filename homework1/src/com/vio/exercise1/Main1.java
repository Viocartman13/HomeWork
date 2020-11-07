package com.vio.exercise1;

import java.util.HashMap;
import java.util.Map;

public class Main1 {
    private static final Integer MAP_KEY_1 = 1;
    private static final Integer MAP_KEY_2 = 2;
    private static final Integer MAP_KEY_3 = 3;
    private static final Integer MAP_KEY_4 = 4;
    private static final String MAP_VALUE_1 = "Value 1";
    private static final String MAP_VALUE_2 = "Value 2";
    private static final String MAP_VALUE_3 = "Value 3";
    private static final String MAP_VALUE_4 = "Value 4";

    public static void main(String[] args) {
        var map = createMap();

        //i was able to add other values because the map created in method Utils.createMap()
        // returns a reference which i am able to modify
        map.put(MAP_KEY_4, MAP_VALUE_4);

        System.out.println("map " + map);
    }

    private static Map<Integer, String> createMap() {
        Map<Integer, String> result = new HashMap<>();

        result.put(MAP_KEY_1, MAP_VALUE_1);
        result.put(MAP_KEY_2, MAP_VALUE_2);
        result.put(MAP_KEY_3, MAP_VALUE_3);

        return result;
    }

}
