package com.likelion.programmers;

public class NumQuery2 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0;i < queries.length;i++) {
            int minNum = Integer.MAX_VALUE;
            for(int j = queries[i][0];j <= queries[i][1];j++) {
                if(arr[j] > queries[i][2])
                    minNum = Math.min(minNum, arr[j]);
            }
            if(minNum != Integer.MAX_VALUE) {
                answer[i] = minNum;
            }
            else answer[i] = -1;
        }
        return answer;
    }
}
