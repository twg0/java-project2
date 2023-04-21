package com.likelion.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x: %d y : %d \n", p1.x, p1.y);
        System.out.printf("x와 y는 동일한가? %s\n", p1.isSameXy());

        Point p2 = new Point();
        p1.x = 10;
        p1.y = 10;
        System.out.printf("x: %d y : %d \n", p1.x, p1.y);
        System.out.printf("x와 y는 동일한가? %s\n", p1.isSameXy());

        Point p3 = new Point();
        p1.x = 10;
        p1.y = 20;
        System.out.printf("x: %d y : %d \n", p1.x, p1.y);
        System.out.printf("x와 y는 동일한가? %s\n", p1.isSameXy());

    }
}
