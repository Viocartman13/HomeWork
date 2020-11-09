package com.vio.exercise5;

import com.vio.utils.Utils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(33);
        linkedList.add(66);
        linkedList.add(99);

        Utils.printMessageAccordingToList(linkedList);

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(33);
        arrayList.add(66);
        arrayList.add(99);

        Utils.printMessageAccordingToList(arrayList);

        Utils.printMessageAccordingToList(null);
    }
}
