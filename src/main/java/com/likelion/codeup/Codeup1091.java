package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        int gapMul = sc.nextInt();
        int gapSum = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 1; i < target; i++) {
            start *= gapMul;
            start += gapSum;
        }
        System.out.println(start);
    }
}
