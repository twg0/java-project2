package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long sum = 0;
        int i = 1;
        while(sum < num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
