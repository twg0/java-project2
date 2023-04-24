package com.likelion.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User admin = new User();
        admin.name = "관리자";
        admin.phoneNumber = "010-0000-1234";
        admin.age = 28;

        User jaesung = new User();
        jaesung.name = "재성 매니저";
        jaesung.phoneNumber = "010-0000-1235";
        jaesung.age = 24;

        System.out.printf("%s님은 성인입니까? %s\n", admin.name, admin.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", jaesung.name, jaesung.isAdult());
    }
}
