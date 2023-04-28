package com.likelion.programmers;

public class HallOfFame {
    public int[] solution(int K, int[] score) {
        int[] answer = new int[score.length];
        int[] scores = new int[K];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                // 현재 확인하려는 수가 scores보다 크다면
                if (scores[j] < score[i]) {
                    for (int k = scores.length - 1; k > j; k--) {
                        scores[k] = scores[k - 1];
                    }
                    scores[j] = score[i];
                    break;
                }
            }
            if (i < K - 1)
                answer[i] = scores[i];
            else {
                answer[i] = scores[K - 1];
            }
        }
        return answer;
    }
}
