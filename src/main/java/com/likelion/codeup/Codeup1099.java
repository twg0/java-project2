package com.likelion.codeup;


import java.util.Scanner;

public class Codeup1099 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[10][10];

        for(int i = 0;i < 10;i++)
        {
            for (int j = 0; j < 10; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int antX = 1;
        int antY = 1;
        if(map[1][1] == 2) {
            map[1][1] = 9;
        }
        map[1][1] = 9;
        while(true) {
            boolean flag = false;
            if(map[antX][antY+1] != 1) {
                if(map[antX][antY+1] == 2) flag = true;
                map[antX][antY + 1] = 9;
                antY++;
            }
            else if(map[antX+1][antY] != 1) {
                if(map[antX+1][antY] == 2) flag = true;
                map[antX+1][antY] = 9;
                antX++;
            }
            else break;
            if(flag) break;
        }

        for(int i = 0;i < 10;i++)
        {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d ", map[i][j]);
            }
            System.out.println();
        }
    }
}
