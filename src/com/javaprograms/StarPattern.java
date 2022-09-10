package com.javaprograms;

public class StarPattern {
    public static void main(String[] args) {
        int row=7, n=6;
        System.out.println("Right Star Pattern");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Left Star Pattern");
        for (int i = 0; i <row; i++) {
            for (int j =2*(row-(i+1)); j>=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Triangle Star Pattern");
        for (int i = 0; i <row; i++) {
            for (int j =(row-(i+2)); j>=0 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Numbers Right Pattern");
        for (int i = 0; i <= n; i++) {
           int  number =1;
            for (int j = 0; j <=i ; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println("Numbers Left Pattern");
        for (int i = 0; i <= n; i++) {
            int  number =1;
            for (int j =2*(row-(i+1)); j>=0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
        System.out.println("Numbers Triangle Pattern");
        for (int i = 0; i <= n; i++) {
            int  number =1;
            for (int j =(row-(i+2)); j>=0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
