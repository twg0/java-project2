package com.likelion.week4.day2;

public abstract class ShapeDrawer {
    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}
