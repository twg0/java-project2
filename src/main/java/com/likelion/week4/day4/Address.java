package com.likelion.week4.day4;

public class Address {

    private String fullAddr;
    private String sido; // 시, 도 라는 행정구역이 한국 밖에 없음
    private String sigungu;

    public String getFullAddr() {
        return fullAddr;
    }

    public String getSido() {
        return sido;
    }

    public String getSigungu() {
        return sigungu;
    }

    public Address(String fullAddr, String sido, String sigungu) {
        this.fullAddr = fullAddr;
        this.sido = sido;
        this.sigungu = sigungu;
    }
}
