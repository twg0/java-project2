package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1047 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long sum = sc.nextInt();
        sum += sc.nextInt();
        sum += sc.nextInt();
        System.out.printf("%d\n%.1f", sum, sum/3.0);
    }
}
