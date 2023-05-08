package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int call = sc.nextInt();
        int[] numArr = new int[call];
        for (int i = 0; i < call; i++) {
            numArr[i] = sc.nextInt();
        }
        for (int i = call-1; i >= 0; i--) {
            System.out.printf("%d ", numArr[i]);
        }
    }
}
