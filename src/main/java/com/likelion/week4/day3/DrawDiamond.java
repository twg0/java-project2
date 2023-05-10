package com.likelion.week4.day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DrawDiamond implements MakeALine{

    @Override
    public String makeALine(int num, int i) {
        StringBuilder sb = new StringBuilder();
        if(i < (num+1) / 2) {
            for (int j = 0; j < (num+1)/2 - i - 1; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2*i + 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        else{
            for (int j = i - (num - (num+1)/2); j > 0; j--) {
                sb.append(" ");
            }
            for (int j = 2*(num - i - 1) + 1; j >= 1;j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
