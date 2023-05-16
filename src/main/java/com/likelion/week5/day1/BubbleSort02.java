package com.likelion.week5.day1;

import java.util.Arrays;

public class BubbleSort02 {

    public void sort(int[] arr, Compare comp) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (comp.compare(arr[i],arr[j]) > 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();

        int[] arr = {7, 2, 3, 9, 28, 1};

        bubbleSort02.sort(arr, new ASC());
        System.out.println(Arrays.toString(arr));

        bubbleSort02.sort(arr, new DESC());
        System.out.println(Arrays.toString(arr));
    }
}
