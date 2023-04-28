package com.likelion.programmers;

public class Collatz {
    class Solution {
        public int solution(int n) {
            int answer = 0;

            long num = n;
            while(true) {
                if(num == 1) break;

                if(num % 2 == 0) {
                    num /= 2;
                }
                else {
                    num *= 3;
                    num++;
                }
                answer++;
                if(answer > 500) {
                    answer = -1;
                    break;
                }
            }
            return answer;
        }
    }
}
