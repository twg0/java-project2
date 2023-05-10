package com.likelion.week4.day3;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

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
