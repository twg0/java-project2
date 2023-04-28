package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        System.out.printf("%.2f\n", (numA + numB + numC) / 3.0);
    }
}
