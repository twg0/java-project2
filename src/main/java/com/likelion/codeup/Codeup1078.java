package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += ((i % 2 == 0) ? i : 0);
        }
        System.out.println(sum);
    }
}
