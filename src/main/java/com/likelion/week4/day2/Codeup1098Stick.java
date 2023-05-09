package com.likelion.week4.day2;

public class Codeup1098Stick {
    private int length;
    private int dir;
    private int x,y;

    protected  Codeup1098Stick() {};

    public Codeup1098Stick(int length, int dir, int x, int y) {
        this.length = length;
        this.dir = dir;
        this.x = x - 1;
        this.y = y - 1;
    }

    public int getLength() {
        return length;
    }

    public int getDir() {
        return dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
