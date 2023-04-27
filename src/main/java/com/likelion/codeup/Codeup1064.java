package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1064 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        System.out.println(numA > numB ? (numB < numC ? numB : numC) : (numA < numC ? numA : numC));
    }
}
