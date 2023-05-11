package com.likelion.week4.day4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFileEx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\twg0\\Desktop\\새 폴더\\1.병원정보서비스 2022.10..csv", StandardCharsets.UTF_8));
        System.out.println(br.readLine());
    }
}
