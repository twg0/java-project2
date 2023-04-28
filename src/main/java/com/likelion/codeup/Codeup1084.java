package com.likelion.codeup;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numR = sc.nextInt();
        int numG = sc.nextInt();
        int numB = sc.nextInt();


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = numR * numG * numB;
        for (int i = 0; i < numR; i++) {
            for (int j = 0; j < numG; j++) {
                for (int k = 0; k < numB; k++) {
                    String str = "";
                    str = i +" " + j + " " + k + "\n";

                    bw.write(str);
                    bw.flush();
                }
            }
        }
        System.out.println(cnt);
    }
}
