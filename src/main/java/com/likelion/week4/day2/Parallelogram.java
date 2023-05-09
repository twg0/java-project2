package com.likelion.week4.day2;

public class Parallelogram implements MakeALine{
    @Override
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", "0".repeat(height - i - 1), "*".repeat(height));
    }
}
