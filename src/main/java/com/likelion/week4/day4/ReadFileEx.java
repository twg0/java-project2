package com.likelion.week4.day4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
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

    public Hospital parse(String str) {
        String[] split = str.split(",");
        Address address = new Address(split[10], split[5], split[7]);
        Hospital hospital = new Hospital(split[1], split[11], address);

        return hospital;
    }

    public List<Hospital> getHospitals(List<String> lines) {
        List<Hospital> hospitals = new ArrayList<>();
        for (String line : lines) {
            hospitals.add(parse(line));
        }
        return hospitals;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\twg0\\Desktop\\새 폴더\\1.병원정보서비스 2022.10..csv";
        ReadFileEx readFileEx = new ReadFileEx(new FileNewBr(), fileName);
        ReadFileEx readFileEx2 = new ReadFileEx(new FileWithInputStreamReader(), fileName);

        List<String> strLines = readFileEx.getList();
        List<Hospital> hospitals = readFileEx.getHospitals(strLines);
        for (Hospital hospital : hospitals) {
            System.out.printf("%s %s %s %s %s\n", hospital.getName(), hospital.getWebsiteAddr(),
                    hospital.getAddress().getFullAddr(), hospital.getAddress().getSido(), hospital.getAddress().getSigungu());
        }
    }
}
