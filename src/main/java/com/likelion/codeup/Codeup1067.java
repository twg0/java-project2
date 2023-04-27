package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1067 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        System.out.println(numA < 0 ? "minus" : "plus");
        System.out.println(numA % 2 == 0 ? "even" : "odd");
    }
}
