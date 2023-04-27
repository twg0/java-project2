package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1057 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        if(numA ==  numB && numA == 0) {
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
