package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int call = sc.nextInt();
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < call; i++) {
            minNum = Math.min(minNum,sc.nextInt());
        }
        System.out.println(minNum);
    }
}
