package com.likelion.programmers;

public class Factorization {
    public int[] solution(int n) {
        int[] answer;
        int[] result = new int[n];
        int index = 0;
        for(int i = 2;i <= n;i++)
        {
            if(n % i == 0) {
                boolean flag = true;
                for(int j = 2;j <= Math.sqrt(i);j++) {
                    if(i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    result[index++] = i;
                }
            }
        }
        answer = new int[index];
        for(int i = 0;i < index;i++) {
            answer[i] = result[i];
        }
        return answer;
    }
}
