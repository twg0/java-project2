package com.likelion.week4.day1;

public class Pyramid implements MakeALine{
    private String spaceChar = "0";

    public Pyramid() {
    }

    public Pyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(spaceChar.repeat(height - i - 1) + "*".repeat(2*i+1));
        }
    }

    // 한줄 만드는 기능 분리
    public String makeALine(int height, int i) {
        return String.format("%s%s\n",spaceChar.repeat(height-i-1), "*".repeat(2*i+1));
    }

    public void printPyramidWithSpaceChar(int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid("0");
        Pyramid pyramid2 = new Pyramid(" ");
        pyramid.printPyramidWithSpaceChar(5);
        pyramid2.printPyramidWithSpaceChar(5);
    }
}
