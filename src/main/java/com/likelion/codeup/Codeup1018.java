package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.next().split(":");
        int h = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);
        System.out.println(h + ":" + m);
    }
}