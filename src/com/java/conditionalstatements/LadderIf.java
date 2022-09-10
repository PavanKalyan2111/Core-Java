package com.java.conditionalstatements;

import java.util.Scanner;

public class LadderIf {
    public static void main(String[] args) {
        System.out.print("Enter Age : ");
        Scanner sc = new Scanner(System.in);
        String gender = "male";
        int age = sc.nextInt();
        if(gender=="male"){
            if(age >18){
                System.out.println("You are eligible to apply for this Job");
            }
            else{
                System.out.println("you are not eligible");
            }

        }
        else
            System.out.println("Not Elligible");
    }
}
