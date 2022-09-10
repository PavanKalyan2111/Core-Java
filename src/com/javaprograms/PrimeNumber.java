package com.javaprograms;

public class PrimeNumber {
    public static void main(String[] args) {
       int m=0,flag=0;
       int n=3; //number to be check for prime or not
        m=n/2; // 11/2 =5
        if(n==0||n==1) {
            System.out.println(+n+" is not a Prime Number");
        }
        else
        {
            for (int i = 2; i <= m; i++)  // m=5
            {
                if (n % i == 0) // 11%2, 11%3,11%4,11%5 which not returns 0 so it's a prime
                {
                    System.out.println(+n+" is not a Prime Number");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println(+n+ " is a Prime Number");
            }
        }

    }
}
