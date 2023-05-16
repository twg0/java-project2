package com.likelion.week5.day1;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSort01 {

    public int[] sortAround(int[] arr, int until) {
        for (int j = 0; j < until; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public void sort(int[] arr) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        for (int i = 1; i <= arr.length - 1; i++) {
            arr = bubbleSort01.sortAround(arr, arr.length - i);
        }
    }

    public static void main(String[] args) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] arr = {3, 0, 4, 2, 1};

        bubbleSort01.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
