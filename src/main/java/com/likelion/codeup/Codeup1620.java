package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1620 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        while(num / 10 != 0) {
            temp = num;
            num = 0;
            while(temp > 0) {
                num += temp % 10;
                temp /= 10;
            }
        }
        System.out.println(num);
    }
}
