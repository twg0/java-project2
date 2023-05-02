package com.likelion.programmers;

public class NumQuery4 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for(int i = 0;i < queries.length;i++) {
            int minNum = Integer.MAX_VALUE;
            for(int j = queries[i][0];j <= queries[i][1];j++) {
                if(j % queries[i][2] == 0)
                    arr[j]++;
            }
        }
        return answer;
    }
}
