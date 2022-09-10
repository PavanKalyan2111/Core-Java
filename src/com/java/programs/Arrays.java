package com.java.programs;

public class Arrays {
    public static void main(String args[]) {
        int[] evenNumbers = new int[10];
        evenNumbers[0] = 2;
        evenNumbers[1] = 4;
        evenNumbers[2] = 6;
        evenNumbers[3] = 8;
        evenNumbers[4] = 10;
        evenNumbers[5] = 12;
        evenNumbers[6] = 14;
        evenNumbers[7] = 16;
        evenNumbers[8] = 18;
        evenNumbers[9] = 20;
        for (int i=0; i<10; i++) {
            System.out.print(evenNumbers[i]);
            if (i == 9) {
                continue;
            }
            System.out.print(", ");
        }
    }
}
