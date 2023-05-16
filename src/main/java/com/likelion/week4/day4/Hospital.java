package com.likelion.week4.day4;

public class Hospital {
    private String name;
    private String websiteAddr;
    private Address address;

    public Hospital(String name, String websiteAddr, Address address) {
        this.name = name;
        this.address = address;
        this.websiteAddr = websiteAddr;
    }

    public String getName() {
        return name;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public Address getAddress() {
        return address;
    }
}
