package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1071 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            num = sc.nextInt();
            if(num == 0) break;
            System.out.println(num);
        } while(num != 0);
    }
}
