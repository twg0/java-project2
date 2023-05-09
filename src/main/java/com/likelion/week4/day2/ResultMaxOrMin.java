package com.likelion.week4.day2;

public class ResultMaxOrMin {
    private MaxOrMin maxOrMin;

    public ResultMaxOrMin(MaxOrMin maxOrMin) {
        this.maxOrMin = maxOrMin;
    }

    public int result(int[] arr) {
        int num = maxOrMin.initial;
        for (int i = 0; i < arr.length; i++) {
            num = maxOrMin.result(num,arr[i]);
        }
        return num;
    }
}
