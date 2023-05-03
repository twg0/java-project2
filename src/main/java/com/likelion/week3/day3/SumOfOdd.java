package com.likelion.week3.day3;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        do {
            if(num % 2 != 0)
                sum += num;
            num--;
        } while(num > 0);
        System.out.println(sum);
    }
}
