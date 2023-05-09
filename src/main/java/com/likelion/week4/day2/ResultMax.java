package com.likelion.week4.day2;

public class ResultMax extends MaxOrMin {

    public ResultMax() {
        initial = Integer.MIN_VALUE;
    }

    @Override
    public int result(int num1, int num2) {
        if(num1 > num2)
            return num1;
        return num2;
    }
}
