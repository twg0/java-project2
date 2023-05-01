package com.likelion.week3.day1;

import java.util.Scanner;

public class Multiplicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        inMultiple(num);
    }

    static void inMultiple(int j) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", j, i, j * i);
        }
    }
}
