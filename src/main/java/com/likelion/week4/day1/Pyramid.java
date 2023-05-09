package com.likelion.week4.day1;

public class Pyramid {
    private String spaceChar = "0";

    public Pyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for (int i = 0; i < height; i++) {
            System.out.println(spaceChar.repeat(height - i - 1) + "*".repeat(2*i+1));
        }
    }

    public static void main(String[] args) {
        Pyramid pyramid = new Pyramid("0");
        Pyramid pyramid2 = new Pyramid(" ");
        pyramid.printPyramid(5);
        pyramid2.printPyramid(5);
    }
}
