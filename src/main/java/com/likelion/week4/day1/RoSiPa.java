package com.likelion.week4.day1;

import com.likelion.codeup.Codeup1671;

import java.util.Scanner;

public class RoSiPa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("가위, 바위, 보 중에 하나를 내세요");
            String st = sc.next();
            int num = -1;
            if(st.equals("바위")) num = 0;
            else if(st.equals("가위")) num = 1;
            else if(st.equals("보")) num = 2;
            else {
                System.out.println("다시 입력하세요");
                continue;
            }
            int cpu = (int)(Math.random() * 3);
            int res = Codeup1671.getWin(num,cpu);
            if(res == 0) System.out.println("비겼습니다");
            else if(res == 1) {
                System.out.println("이겼습니다");
                break;
            }
            else System.out.println("졌습니다");
        }
    }
}
