package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = num-i-1; j > 0; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
