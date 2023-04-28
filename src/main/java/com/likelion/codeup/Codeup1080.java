package com.likelion.codeup;


import java.io.IOException;
import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if(sum >= num) {
                System.out.println(i);
                break;
            }
        }
    }
}
