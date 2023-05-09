package com.likelion.week4.day2;

import java.util.Arrays;

public class Codeup1098Board {
    int[][] map;
    int row;
    int col;

    public void setMap(Codeup1098Stick stick) {
        if(stick.getDir() == 0) { // 가로
            for (int i = 0; i < stick.getLength(); i++) {
                map[stick.getX()][stick.getY() + i] = 1;
            }
        } else {
            for (int i = 0; i < stick.getLength(); i++) {
                map[stick.getX() + i][stick.getY()] = 1;
            }
        }
    }

    public Codeup1098Board(int row, int col) {
        this.row = row;
        this.col = col;
        this.map = new int[row][col];
    }

    public void printMap() {
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
