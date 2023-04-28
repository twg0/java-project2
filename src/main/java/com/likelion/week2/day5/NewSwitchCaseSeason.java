package com.likelion.week2.day5;

public class NewSwitchCaseSeason {
    public static void main(String[] args) {
        int month = 11;
        switch(month) {
            case 12, 1, 2 -> System.out.println("겨울");
            case 3, 4, 5 -> System.out.println("겨울");
            case 6, 7, 8 -> System.out.println("겨울");
            case 9, 10, 11 -> System.out.println("겨울");
            default -> System.out.println("겨울");
        }
    }
}
