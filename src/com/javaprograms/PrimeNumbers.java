package com.javaprograms;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Enter start and end values to get the prime numbers");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count=0;
        System.out.println("List of Prime Numbers between " +start+ " and " +end);
        for (int i = start; i <= end; i++) {
            if(isPrime(i)){
                System.out.print(+i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of Prime Numbers Between " +start+ " and " +end+ " is " +count);
    }

    public static boolean isPrime(int n) {
        if(n<=1){
            return false;
        }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i==0){
                    return false;
                }
            }
            return true;
    }
}
