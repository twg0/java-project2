package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numM = sc.nextInt();
        for (int i = 1; i <= numN; i++) {
            for (int j = 1; j <= numM; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
