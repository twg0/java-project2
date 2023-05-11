package com.likelion.week4.day3;

public abstract class ShapeDrawer implements Printer2{
    public abstract String makeALine(int h, int i);

    public void printShape(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }
}
