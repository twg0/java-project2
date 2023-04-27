package com.likelion.programmers;

public class SecretMap {
    static int n = 5;
    static int[] arr1 = new int[]{9, 1, 28, 18, 11};
    static int[] arr2 = new int[]{30, 1, 21, 17, 28};
    static void solution() {

        for (int i = 0; i < n; i++) {
            String binaryString = Integer.toBinaryString(arr1[i] | arr2[i]);

            String subBinary = "";
            if(binaryString.length() > n)
                subBinary = binaryString.substring(binaryString.length() - 1 - n, binaryString.length());
            else {
                for (int j = 0; j < n - binaryString.length(); j++) {
                    subBinary += "0";
                }
                subBinary += binaryString;
            }

            for (int j = 0; j < n; j++) {
                if(subBinary.charAt(j) == '1')
                    System.out.printf("#");
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solution();
    }
}
