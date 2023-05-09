package com.likelion.week4.day2;

public class PrintShapeDrawer {
    private ShapeDrawer shapeDrawer;

    public PrintShapeDrawer(ShapeDrawer shapeDrawer) {
        this.shapeDrawer = shapeDrawer;
    }

    public void print(int height) {
        shapeDrawer.printShape(height);
    }
}
