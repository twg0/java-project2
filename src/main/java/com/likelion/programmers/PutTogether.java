package com.likelion.programmers;

public class PutTogether {
    public int solution(int[] num_list) {
        int answer = 0;
        String odd = "";
        String even = "";
        for(int i = 0;i < num_list.length;i++){
            if(num_list[i] % 2 == 0)
                even += num_list[i];
            else
                odd += num_list[i];
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }

    public int solution2(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for(int i = 0;i < num_list.length;i++){
            if(num_list[i] % 2 == 0) {
                even *= 10;
                even += num_list[i];
            }
            else {
                odd += num_list[i];
                odd += num_list[i];
            }
        }
        answer = even + odd;
        return answer;
    }
}
