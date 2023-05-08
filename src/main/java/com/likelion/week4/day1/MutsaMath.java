package com.likelion.week4.day1;

public class MutsaMath {
    public int getSumOfFactors(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i == 0) sum += i;
        }
        return sum;
    }

    public int getSumOfFactors(int[] numArr) {
        int sum = 0;
        for (int i = 0; i < numArr.length; i++) {
            sum += getSumOfFactors(numArr[i]);
        }
        return sum;
    }

    public int getMax(int[] numArr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
            max = Math.max(max, numArr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        System.out.println("mutsaMath.getSumOfFactors(12) = " + mutsaMath.getSumOfFactors(12));
        System.out.println(mutsaMath.getSumOfFactors(new int[]{12, 36, 48, 29}));
    }
}
