package com.likelion.week4.day2;

import java.util.Scanner;

public class Codeup1098Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        Codeup1098Board board = new Codeup1098Board(row,col);
        int stickNum = sc.nextInt();
        for (int i = 0; i < stickNum; i++) {
            Codeup1098Stick stick = new Codeup1098Stick(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            board.setMap(stick);
        }
        board.printMap();
    }
}
