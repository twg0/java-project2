package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().split("[.]");
        System.out.printf("%s-%s-%s", split[2], split[1], split[0]);
    }
}
