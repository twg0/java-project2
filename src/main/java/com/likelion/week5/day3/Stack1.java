package com.likelion.week5.day3;

public class Stack1 {

    private int[] arr;
    private int pointer = 0;

    public Stack1() {
        arr = new int[10000];
    }

    public Stack1(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        arr[pointer++] = value;
    }

    public int pop() {
        return arr[--pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;
    }

    public static void main(String[] args) {
        Stack1 stack1 = new Stack1();
        stack1.push(10);
        stack1.push(20);
        System.out.println(stack1.isEmpty());
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
        System.out.println(stack1.isEmpty());
    }
}
