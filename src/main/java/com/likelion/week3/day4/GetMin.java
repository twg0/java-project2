package com.likelion.week3.day4;

public class GetMin {
    public static void main(String[] args) {
        int[] arr = {2, 1, 31, 9, 7};

        int targetValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < targetValue)
                targetValue = arr[i];
        }

        System.out.println(targetValue);
    }
}
