package com.likelion.week3.day2;

public class WhileEx {
    public static void main(String[] args) {

//        while (true) {
//            System.out.println("Hello");
//        }

        int cnt = 0;
        while (cnt < 11){
            System.out.println(cnt++);
        }

        cnt = 0;
        while (cnt < 11){
            System.out.printf("%d ", cnt++);
        }

    }
}
