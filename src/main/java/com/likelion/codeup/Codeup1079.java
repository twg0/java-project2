package com.likelion.codeup;


import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup1079 {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        while(true) {
            int ch = is.read();
            is.read();
            System.out.printf("%c\n", ch);
            if(ch == 'q') break;
        }
    }
}
