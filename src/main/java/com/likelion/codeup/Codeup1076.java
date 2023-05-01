package com.likelion.codeup;


import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1076 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        int num = is.read();

        int start = 'a';
        while(true) {
            System.out.printf("%c ",start);
            if(start == num) break;
            start++;
        }
    }
}
