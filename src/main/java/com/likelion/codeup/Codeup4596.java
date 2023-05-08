package com.likelion.codeup;

import java.util.Scanner;

public class Codeup4596 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] map = new int[10][10];
        int target = 0;
        int[] targetIdx = {0,0};

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                map[i][j] = sc.nextInt();
                if(map[i][j] > target) {
                    target = map[i][j];
                    targetIdx[0] = i;
                    targetIdx[1] = j;
                }
            }
        }

        System.out.println(target);
        System.out.println(targetIdx[0] + " " + targetIdx[1]);
    }
}
