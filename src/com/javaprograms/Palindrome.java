package com.javaprograms;

public class Palindrome {
    public static void main(String[] args) {
        //Palindrome, if original value and reverse of that value are same
        int n=454,r,temp, sum=0;
        temp = n;
        while(n>0){
            r= n%10;// remainder
            sum =(sum*10)+r;
            n=n/10;
        }
        if(temp == sum){
            System.out.println(+temp+" is a palindrome");
        }
        else
            System.out.println(+temp+" is not a palindrome");
    }
}
