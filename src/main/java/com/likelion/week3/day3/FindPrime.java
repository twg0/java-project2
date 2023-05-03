package com.likelion.week3.day3;

import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("It is Prime");
        else System.out.println("It is not Prime");
    }
}
