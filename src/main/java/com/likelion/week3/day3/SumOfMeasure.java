package com.likelion.week3.day3;

import java.util.Scanner;

public class SumOfMeasure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int sum = 0;
        do {
            if(num % i == 0)
                sum += i;
            i++;
        } while(i <= num);
        System.out.println(sum);
    }
}
