package com.likelion.week2.day3;

public class Accumulate687 {
    public static void main(String[] args) {

        int num = 687;
        int answer = 0;

        answer = num % 10;
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);

        answer += num % 10;
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);

        answer += num % 10;
        num = num / 10;
        System.out.printf("num:%d, answer:%d\n", num, answer);
    }
}
