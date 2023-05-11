package com.likelion.codeup;

import java.util.ArrayList;
import java.util.Scanner;

public class Codeup3108Test {
    public static void main(String[] args) {
        
        Codeup3108 codeup3108 = new Codeup3108(new ArrayList<>());

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            codeup3108.operation(sc.next(), sc.nextInt(), sc.next());
        }

        for (int i = 0; i < 5; i++) {
            num = sc.nextInt() - 1;
            codeup3108.printDataInList(num);
        }
    }
}
