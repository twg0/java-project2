package com.likelion.codeup;

import java.util.*;

public class Codeup3108 {

    private ArrayList<Data> memory;

    public Codeup3108(ArrayList<Data> memory) {
        this.memory = memory;
    }

    public void operation(String code, int number, String name) {
        switch(code) {
            case "I":
                int res = getInsultIndex(number);
                if(res != -1)
                    setMountain(res, number, name);
                break;
            case "D":
                removeData(number);
                break;
            default:
                break;
        }
    }

    public void setMountain(int index, int num, String name) {
        memory.add(index, new Data(num, name));
    }

    public int getInsultIndex(int number) {
        if(memory.isEmpty()) return 0;
        for (int j = 0; j < memory.size(); j++) {
            if(memory.get(j).getNum() == number) {
                return -1;
            }
            else if(memory.get(j).getNum() > number) {
                return j;
            }
        }
        return memory.size(); // 가능한가?
    }

    public void removeData(int number) {
        for (int j = 0; j < memory.size(); j++) {
            if(memory.get(j).getNum() == number) {
                memory.remove(j);
            }
        }
    }

    public void printDataInList(int number) {
        System.out.println(memory.get(number).getNum() + " " + memory.get(number).getName());
    }

    public void removeDupleData(Data data) {
        for (int i = 0; i < memory.size(); i++) {
            if(memory.get(i).equals(data))
                memory.remove(data);
        }
    }

    public ArrayList<Data> getMemory() {
        return memory;
    }
}

class Data{
    private int num;
    private String name;

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public Data(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode())
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
