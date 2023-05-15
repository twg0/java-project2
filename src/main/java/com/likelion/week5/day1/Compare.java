package com.likelion.week5.day1;

import java.util.Comparator;

public interface Compare extends Comparator<Integer> {
    @Override
    int compare(Integer o1, Integer o2);
}
