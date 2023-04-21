package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.next().split(":");
        System.out.println(Integer.parseInt(split[1]));
    }
}
