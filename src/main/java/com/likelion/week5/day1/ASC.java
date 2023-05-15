package com.likelion.week5.day1;

import java.util.Comparator;

public class ASC implements Compare {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2;
    }
}
