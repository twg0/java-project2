package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int gap = sc.nextInt();
        int target = sc.nextInt();

        for (int i = 1; i < target; i++) {
            start += gap;
        }
        System.out.println(start);
    }
}
