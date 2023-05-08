package com.likelion.week4.day1;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김미미";
        user1.age = 14;

        User user2 = new User();
        user2.name = "김나나";
        user2.age = 37;

        System.out.println("user1.isAdult() = " + user1.isAdult());
        System.out.println("user2.isAdult() = " + user2.isAdult());
    }
}