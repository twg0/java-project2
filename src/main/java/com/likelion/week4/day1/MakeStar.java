package com.likelion.week4.day1;

import java.util.Scanner;

public class MakeStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 직각
        System.out.println("직각삼각형");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        // 피라미드
        System.out.println("피라미드");
        for (int i = 0; i < num; i++) {
            for (int j = num-i-1; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        // 역직각
        System.out.println("역직각삼각형");
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        // 역피라미드
        System.out.println("역피라미드");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2*(num-i-1) + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        // 다이아몬드
        System.out.println("다이아몬드");
        for (int i = 0; i < num; i++) {
            if(i < (num+1) / 2) {
                for (int j = 0; j < (num+1)/2 - i - 1; j++) {
                    System.out.printf(" ");
                }
                for (int j = 0; j < 2*i + 1; j++) {
                    System.out.printf("*");
                }
                System.out.println();
            }
            else{
                for (int j = i - (num - (num+1)/2); j > 0; j--) {
                    System.out.printf(" ");
                }
                for (int j = 2*(num - i - 1) + 1; j >= 1;j--) {
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}
