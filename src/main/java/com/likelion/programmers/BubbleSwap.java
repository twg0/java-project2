package com.likelion.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSwap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();             // 정렬할 배열의 길이 입력

        int[] arr = new int[num];           // 입력된 배열의 길이 만큼 배열 선언
        for (int i = 0; i < num; i++) {     // 배열 입력
            arr[i] = sc.nextInt();
        }

        // 앞뒤의 요소를 바꾸는 로직이므로 배열의 전체 길이보다 1 적은 횟수로 반복
        for(int i = 0;i < arr.length - 1;i++) {
            // 한 번의 반복마다 맨 뒤의 요소는 가장 큰 수로 확정됨
            // 반복 횟수를 1씩 줄여나감
            for (int j = 0; j < arr.length-1-i; j++) {
                // j번째 요소와 j+1번째 요소를 확인
                if(arr[j] > arr[j+1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // 출력
        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }
}
