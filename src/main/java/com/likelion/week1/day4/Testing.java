package com.likelion.week1.day4;

public class Testing {
    public static void main(String[] args) {
        String name = "name";
        String name2 = "name";
        System.out.println(name == name2);
        System.out.println(name.equals(name2));

        String name3 = "name";
        String name4 = new String("name");
        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));
    }
}
