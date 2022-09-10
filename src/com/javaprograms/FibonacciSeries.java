package com.javaprograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        //Fibonacci Series 0 1 1 2 3 5 8 13 21 34 55....
        int n1=0, n2=1, n3=0, count=8;
        System.out.println("Fibonacci Series : ");
        System.out.print(+n1+ " " +n2);
        for (int i = 2; i < count; i++) {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        }
    }
}
