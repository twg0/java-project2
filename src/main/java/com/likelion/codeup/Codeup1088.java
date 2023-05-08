package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        while(i <= num) {
            if(i % 3 != 0) {
                System.out.printf("%d ",i);
            }
            i++;
        }
    }
}
