package com.java.conditionalstatements;

import java.util.Scanner;

public class IfElseCondition {
    public static void main(String[] args) {
        System.out.print("Enter The Age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
            System.out.println("Major");
        else
            System.out.println("Minor");

    }
}
