package com.likelion.week4.day2;

public class DrawerTest {
    public static void main(String[] args) {
        PrintShapeDrawer printShapeDrawer = new PrintShapeDrawer(new PyramidShapeDrawer());
        printShapeDrawer.print(6);
    }
}
