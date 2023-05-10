package com.likelion.week4.day3;

import java.io.IOException;

public class PrintToConsole implements Printing{
    @Override
    public void print(String str) throws IOException {
        System.out.println(str);
    }
}
