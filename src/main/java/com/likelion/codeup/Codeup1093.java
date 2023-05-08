package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[24];
        int call = sc.nextInt();
        for (int i = 0; i < call; i++) {
            int number = sc.nextInt();
            numArr[number]++;
        }
        for (int i = 1; i < 24; i++) {
            System.out.printf("%d ", numArr[i]);
        }
    }
}
