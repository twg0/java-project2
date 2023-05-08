package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        int[][] map = new int[height+1][width+1];
        int stick = sc.nextInt();
        for (int i = 0; i < stick; i++) {
            int length = sc.nextInt();
            int dir = sc.nextInt();
            int stickX = sc.nextInt();
            int stickY = sc.nextInt();
            if(dir == 0) {
                for (int j = 0; j < length; j++) {
                    map[stickX][stickY+j] = 1;
                }
            } else {
                for (int j = 0; j < length; j++) {
                    map[stickX + j][stickY] = 1;
                }
            }
        }

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}
