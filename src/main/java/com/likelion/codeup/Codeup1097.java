package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[20][20];

        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int crossX = sc.nextInt();
            int crossY = sc.nextInt();
            for (int j = 0; j < 20; j++) {
                map[crossX][j] = (map[crossX][j] == 1) ? 0 : 1;
            }
            for (int j = 0; j < 20; j++) {
                map[j][crossY] = (map[j][crossY] == 1) ? 0 : 1;
            }
        }
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}
