package com.likelion.week4.day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        FileOutputStream outputStream = new FileOutputStream("c:/out.txt");
        StringBuilder sb = new StringBuilder();

        // 다이아몬드
        System.out.println("다이아몬드");
        for (int i = 0; i < num; i++) {
            if(i < (num+1) / 2) {
                for (int j = 0; j < (num+1)/2 - i - 1; j++) {
                    sb.append(" ");
                }
                for (int j = 0; j < 2*i + 1; j++) {
                    sb.append("*");
                }
                sb.append("\n");
            }
            else{
                for (int j = i - (num - (num+1)/2); j > 0; j--) {
                    sb.append(" ");
                }
                for (int j = 2*(num - i - 1) + 1; j >= 1;j--) {
                    sb.append("*");
                }
                sb.append("\n");
            }
        }
        outputStream.write(sb.toString().getBytes());
        outputStream.close();
    }
}
