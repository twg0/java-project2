package com.likelion.week5.day1;

public class DESC implements Compare{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
