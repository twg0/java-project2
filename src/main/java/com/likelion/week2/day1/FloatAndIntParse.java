package com.likelion.week2.day1;

public class FloatAndIntParse {
    public static void main(String[] args) {
        String st2 = "2.5";
        String st1 = "1.5";
        System.out.println(st1 + st2);
        System.out.println(Float.parseFloat(st1) + Float.parseFloat(st2));
        System.out.println(Integer.parseInt(st1) + Integer.parseInt(st2)); // 캐스팅 에러(NumberFormat)
    }
}
