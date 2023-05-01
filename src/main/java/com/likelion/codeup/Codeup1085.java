package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long bit = 1;
        for (int i = 0; i < 4; i++) {
            bit *= sc.nextInt();
        }
        System.out.printf("%.1f MB", bit / 8.0 / 1024 / 1024);
    }
}
