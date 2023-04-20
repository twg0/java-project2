package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.next().split(".");
        System.out.println(strings.length);
        System.out.printf("%s.%02s.%02s", strings[0], strings[1], strings[2]);
    }
}