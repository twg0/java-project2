package com.likelion.week3.day3;

import java.util.Scanner;

public class DoWhileNotice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("짝수를 입력하세요");
            num = sc.nextInt();
        } while(num % 2 != 0);
    }
}
