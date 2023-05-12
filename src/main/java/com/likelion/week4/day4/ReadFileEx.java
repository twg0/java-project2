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
        for (String str : list) {
            System.out.println(str);
        }

        List<String> list2 = readFileEx2.getList();
        for (String str : list2) {
            System.out.println(str);
        }
    }
}
