package com.likelion.week4.day3;

import java.io.IOException;

public class DiamondMain {
    public static void main(String[] args) throws IOException {
        MakeALine makeALine = new DrawDiamond();
        BuildDiamond buildDiamond = new BuildDiamond(makeALine);

        Printing printing = new PrintToConsole();

        printing.print(buildDiamond.build(5));

        Printing printing2 = new PrintToFile();
        printing2.print(buildDiamond.build(7));
    }
}
