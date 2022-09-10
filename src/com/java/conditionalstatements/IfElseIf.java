package com.java.conditionalstatements;

public class IfElseIf {
    public static void main(String[] args) {
        int temparature = 32;
        if(temparature>30){
            System.out.println("It's a Hot Day");
            System.out.println("Drink Plenty of Water");
        }
        else if(temparature>20 && temparature<=30)
            System.out.println("Beautiful Day");
        else
            System.out.println("It's Cold");
    }
}
