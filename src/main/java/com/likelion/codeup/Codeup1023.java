package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().split("[.]");
        System.out.println(split[0]);
        System.out.println(split[1]);
    }
}