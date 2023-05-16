package com.likelion.week5.day2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};

        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            int target = index;
            for (int j = index; j < arr.length; j++) {
                if(arr[target] > arr[j]) {
                    target = j;
                }
            }
            int temp = arr[index];
            arr[index++] = arr[target];
            arr[target] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
