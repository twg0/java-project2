package com.likelion.week3.day3;

import java.util.Stack;

public class MaxHeapSize {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                st.push(i);
            } catch(Exception e) {
                System.out.println(i);
                break;
            }
        }
        // 돌리면 큰일남
    }
}
