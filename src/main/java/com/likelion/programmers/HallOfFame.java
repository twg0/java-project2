package com.likelion.programmers;

public class HallOfFame {
    public int[] solution(int K, int[] score) {
        int[] answer = new int[score.length];
        int[] scores = new int[K]; // 명예의 전당

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                // 현재 확인하려는 i가 명예의 전당의 j번째 보다 크다면
                if (scores[j] < score[i]) {
                    // 뒤로 전부 한칸씩 밀기
                    for (int k = scores.length - 1; k > j; k--) {
                        scores[k] = scores[k - 1];
                    }
                    // 빈 자리에 현재 i 넣기
                    scores[j] = score[i];
                    break;
                }
            }
            // 현재 명예의 전당에 등록된 수에 따라 answer에 삽입
            if (i < K - 1)
                answer[i] = scores[i];
            else {
                answer[i] = scores[K - 1];
            }
        }
        return answer;
    }
}
