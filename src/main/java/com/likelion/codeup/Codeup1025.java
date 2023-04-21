package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i < 5;i++) {
            System.out.printf("[");
            System.out.printf("%c", s.charAt(i));
            for (int j = 4-i; j >= 1 ; j--) {
                System.out.printf("0");
            }
            System.out.printf("]\n");
        }
    }
}