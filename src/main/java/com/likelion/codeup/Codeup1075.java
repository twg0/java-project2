package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1075 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(true) {
            System.out.println(--num);
            if(num == 0) break;
        }
    }
}
