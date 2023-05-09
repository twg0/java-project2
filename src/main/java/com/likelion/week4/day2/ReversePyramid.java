package com.likelion.week4.day2;

public class ReversePyramid implements MakeALine{
    // 메소드 분리
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", "0".repeat(i), "*".repeat(2*(height-i) -1));
    }

    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid();
        int height = 6;
        for (int i = 0; i < height; i++) {
            // 기존 로직을 method호출하게 변경
            System.out.print(reversePyramid.makeALine(height,i));
        }
    }
}
