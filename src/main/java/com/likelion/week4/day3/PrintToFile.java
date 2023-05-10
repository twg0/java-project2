package com.likelion.week4.day3;

import java.io.FileOutputStream;
import java.io.IOException;

public class PrintToFile implements Printing{
    @Override
    public void print(String str) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("c:/out.txt");
        outputStream.write(str.getBytes());
        outputStream.close();
    }
}
