package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        for (int i = 1; i <= numA * numB * numC; i++) {
            if (i % numA == 0 && i % numB == 0 && i % numC == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
