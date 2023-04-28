package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        System.out.printf("%d+%d=%d\n", numA, numB, numA + numB);
        System.out.printf("%d-%d=%d\n", numA, numB, numA - numB);
        System.out.printf("%d*%d=%d\n", numA, numB, numA * numB);
        System.out.printf("%d/%d=%d\n", numA, numB, numA / numB);
    }
}
