package com.likelion.week4.day3;

public class BuildDiamond {
    private MakeALine makeALine;

    public BuildDiamond(MakeALine makeALine) {
        this.makeALine = makeALine;
    }

    public String build(int height) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            sb.append(makeALine.makeALine(height, i));
        }
        return sb.toString();
    }
}
