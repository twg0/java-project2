package com.likelion.week3.day2;

import java.util.Scanner;

public class WhileFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 1;
        while (num > 0) {
            answer *= num--;
        }
        System.out.println(answer);
    }
}
