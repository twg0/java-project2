package com.likelion.week4.day2;

public class ResultMaxOrMinMain {
    public static void main(String[] args) {
        MaxOrMin max = new ResultMax();
        MaxOrMin min = new ResultMin();
        int[] arr = {4, 9 ,2, 1, -4, 0};
        ResultMaxOrMin result = new ResultMaxOrMin(max);
        System.out.println(result.result(arr));
        ResultMaxOrMin result2 = new ResultMaxOrMin(min);
        System.out.println(result2.result(arr));
    }
}
