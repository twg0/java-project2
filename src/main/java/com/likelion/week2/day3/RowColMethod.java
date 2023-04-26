package com.likelion.week2.day3;

import java.util.Arrays;

public class RowColMethod {
    static void setRow(int[][] arr, int row) {
        for(int i = 0;i < arr[row].length;i++) {
            arr[row][i] = 1;
        }
    }
    static void setCol(int[][] arr, int col) {
        for(int i = 0;i < arr.length;i++) {
            arr[i][col] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[10][10];

        setRow(arr, 3);

        setCol(arr, 7);

        for(int i = 0;i < 10;i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
