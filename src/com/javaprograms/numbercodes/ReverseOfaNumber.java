package com.javaprograms.numbercodes;

public class ReverseOfaNumber {
    public static void main(String[] args) {
        int number = 35412;
        int temp = number;
        int reverse=0;
        while(number!=0){
            int remainder = number%10; // remainder value
            reverse = (reverse*10)+remainder;
            number = number/10; // quotient value
            }
        System.out.println("Reverse of a number "+temp+ " is : "+reverse);
        }

    }
