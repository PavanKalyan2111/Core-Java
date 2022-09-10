package com.javaprograms;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        String originalValue,reverseValue = "";
        System.out.print("Enter the string/number to check the palindrome or not : ");
        Scanner sc = new Scanner(System.in);
        originalValue = sc.nextLine();
        int length = originalValue.length();
        for (int i = length-1; i >= 0; i--) {
            reverseValue = reverseValue+originalValue.charAt(i);
        }
        if(originalValue.equals(reverseValue)){
            System.out.println(originalValue+" is a Palindrome");
        }
        else
            System.out.println(originalValue+" is not a Palindrome");
    }
}
