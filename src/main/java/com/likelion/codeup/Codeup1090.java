package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        int gapMul = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 1; i < target; i++) {
            start *= gapMul;
        }
        System.out.println(start);
    }
}
