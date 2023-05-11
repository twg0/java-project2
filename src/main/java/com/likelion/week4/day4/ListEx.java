package com.likelion.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        list.add(5);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.remove(0));
        System.out.println(list.remove(0));
        System.out.println(list.isEmpty());
    }
}
