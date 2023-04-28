package com.likelion.codeup;


import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1082 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int num = is.read();

        for(int i = 1;i<= 15;i++) {
            System.out.printf("%X*%X=%X\n",10 + num - 65,i, i * (10 + num - 65));
        }
    }
}
