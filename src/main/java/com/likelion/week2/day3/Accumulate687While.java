package com.likelion.week2.day3;

public class Accumulate687While {
    public static void main(String[] args) {

        int num = 687;
        int answer = 0;

        while(num > 0) {
            answer += num % 10;
            num /= 10;
        }

        System.out.printf("num:%d answer:%d", num, answer);
    }
}
