package com.vio.utils;

import java.util.*;

public class Utils {

    public static Optional<Integer> randomOptionalGenerator() {
        return Math.random() >= 0.5 ? Optional.of(1) : Optional.empty();
    }

    public static void printMessageAccordingToList(List<Integer> list) {
        if (list instanceof ArrayList<Integer> arrayList) {
            System.out.println("printed array list");
            for (Integer element : arrayList) {
                System.out.println("array list element : " + element);
            }
        } else if (list instanceof LinkedList<Integer> linkedList && !linkedList.isEmpty()) {
            System.out.println("printed linked list in reverse order");
            Iterator<Integer> reverseIterator = linkedList.descendingIterator();
            while (reverseIterator.hasNext()) {
                System.out.println("linked list element: " + reverseIterator.next());
            }
        } else {
            System.out.println("disappointing error message");
        }
    }

    public static String checkDayOfTheWeek(DaysOfWeek dayOfWeek) {
        var result = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "workday";
            case SATURDAY, SUNDAY -> "weekend";
        };

        return result;
    }


}
