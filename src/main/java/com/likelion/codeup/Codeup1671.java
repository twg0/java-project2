package com.likelion.codeup;

import java.util.Scanner;

public class Codeup1671 {
    public static int getWin(int userA, int userB) {
        if(userA == userB) return 0;
        if((userA == 0 && userB == 1) || (userA == 1 && userB == 2) || (userA == 2 && userB == 0)) return 1;
        else return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userA = sc.nextInt();
        int userB = sc.nextInt();
        int res = getWin(userA, userB);
        if(res == 0) System.out.println("tie");
        else if(res == 1) System.out.println("win");
        else System.out.println("lose");
    }
}
