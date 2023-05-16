package com.likelion.week4.day4;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String str) {
        String[] split = str.split(",");
        Address address = new Address(split[10], split[5], split[7]);
        Hospital hospital = new Hospital(split[1], split[11], address);

        return hospital;
    }
}
