package com.likelion.week3.day1;

public class NewSwitchCaseClinicHoursChallenge {
    public static void main(String[] args) {
        String title = "서울석병원 외래진료시간표";
        String day = "수";
        String time = "";
        switch(day) {
            case "월", "화","수","목","금"-> time = "09:00 ~ 18:00";
            case "토" -> time = "09:00 ~ 14:00";
            default -> time = "휴진";
        }
        System.out.println(time);
    }
}
