package com.likelion.week3.day1;

public class ForReverse {
    public static void main(String[] args) {

        // 틀리는 Case
//        for (int i = 10; i > 0; i++) {
//            System.out.println(i);
//        }

        // 10 ~ 1
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // 10 ~ 0
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
