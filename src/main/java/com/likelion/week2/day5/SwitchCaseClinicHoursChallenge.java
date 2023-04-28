package com.likelion.week2.day5;

public class SwitchCaseClinicHoursChallenge {
    public static void main(String[] args) {
        String title = "서울석병원 외래진료시간표";
        String day = "수";
        String time = "";
        switch(day) {
            case "월", "화","수","목","금":
                time = "09:00 ~ 18:00";
                break;
            case "토":
                time = "09:00 ~ 14:00";
                break;
            default:
                time = "휴진";
        }
    }
}
