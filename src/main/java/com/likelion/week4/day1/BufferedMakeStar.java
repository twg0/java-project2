package com.likelion.week4.day1;

import java.io.*;

public class BufferedMakeStar {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());

        // 직각
        System.out.println("직각삼각형");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.append("\n");
        bw.flush();

        // 피라미드
        System.out.println("피라미드");
        for (int i = 0; i < num; i++) {
            for (int j = num-i-1; j > 0; j--) {
                bw.append(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.append("\n");
        bw.flush();

        // 역직각
        System.out.println("역직각삼각형");
        for (int i = 1; i <= num; i++) {
            for (int j = num - i; j > 0; j--) {
                bw.append(" ");
            }
            for (int j = 0; j < i; j++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.append("\n");
        bw.flush();

        // 역피라미드
        System.out.println("역피라미드");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                bw.append(" ");
            }
            for (int j = 0; j < 2*(num-i-1) + 1; j++) {
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.append("\n");
        bw.flush();

        // 다이아몬드
        System.out.println("다이아몬드");
        for (int i = 0; i < num; i++) {
            if(i < (num+1) / 2) {
                for (int j = 0; j < (num+1)/2 - i - 1; j++) {
                    bw.append(" ");
                }
                for (int j = 0; j < 2*i + 1; j++) {
                    bw.append("*");
                }
                bw.append("\n");
            }
            else{
                for (int j = i - (num - (num+1)/2); j > 0; j--) {
                    bw.append(" ");
                }
                for (int j = 2*(num - i - 1) + 1; j >= 1;j--) {
                    bw.append("*");
                }
                bw.append("\n");
            }
        }
        bw.append("\n");
        bw.flush();
    }
}
