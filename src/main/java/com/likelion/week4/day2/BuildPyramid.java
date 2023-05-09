package com.likelion.week4.day2;

public class BuildPyramid {
    int height;

    public BuildPyramid(int height) {
        this.height = height;
    }

    public void print(MakeALine makeALine) {
        for (int i = 0; i < height; i++) {
            // 기존 로직을 method호출하게 변경
            System.out.print(makeALine.makeALine(height,i));
        }
    }
    public static void main(String[] args) {
        BuildPyramid buildPyramid = new BuildPyramid(5);
        MakeALine makeALine = new Parallelogram();
        buildPyramid.print(makeALine);
    }
}
