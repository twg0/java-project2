package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().replaceAll("[A-Z]", " ").split(" ");
        System.out.println(Integer.parseInt(split[1]) * 12 + Integer.parseInt(split[2]) * 1);
    }
}
