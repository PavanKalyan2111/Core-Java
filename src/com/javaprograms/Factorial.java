package com.javaprograms;

public class Factorial {
    public static void main(String[] args) {
        //Factorial of a number 4! = 4*3*2*1 = 24
        int n=5,fact=1;
        for (int i = 1; i <= 5; i++) {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
