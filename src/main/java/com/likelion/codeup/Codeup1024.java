package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i = 0;i < s.length();i++)
            System.out.printf("'%c'\n",s.charAt(i));
    }
}