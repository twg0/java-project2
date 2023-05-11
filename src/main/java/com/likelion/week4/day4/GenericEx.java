package com.likelion.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("bye");
        stringList.add("1");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (String s : stringList) {
            System.out.println(s);
        }

        for (Integer integer : intList) {
            System.out.println(integer);
        }
    }
}
