package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
    }
}
