package com.likelion.week4.day4;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadFileEx {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public ReadFileEx(GetLines getlines, String fileName) throws IOException {
        this.list = getlines.getLines(fileName);
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\twg0\\Desktop\\새 폴더\\1.병원정보서비스 2022.10..csv";
        ReadFileEx readFileEx = new ReadFileEx(new FileNewBr(),fileName);
        ReadFileEx readFileEx2 = new ReadFileEx(new FileWithInputStreamReader(),fileName);

        List<String> list = readFileEx.getList();
        for (int i = 0; i < 9; i++) {
            System.out.println(list.get(i));
        }
    }
}
