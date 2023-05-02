package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bit = 1;
        for (int i = 0; i < 3; i++) {
            bit *= sc.nextInt();
        }
        System.out.printf("%.2f MB", bit / 8.0 / 1024 / 1024);
    }
}
