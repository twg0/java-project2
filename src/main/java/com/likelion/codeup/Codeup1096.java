package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[20][20];
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int stoneX = sc.nextInt();
            int stoneY = sc.nextInt();
            map[stoneX][stoneY] = 1;
        }
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}
