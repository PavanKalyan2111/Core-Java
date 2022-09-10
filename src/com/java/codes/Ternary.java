package com.java.codes;

public class Ternary {
    public static void main(String[] args) {
        /* Ternary condition is alternative of if else condition */
        //to check min number
        int a = 3, b= 5;
        int min = (a<b) ?  a: b;
        System.out.println("Minimum Value is : "+min);

        //to check vote eligibility
        int age =22;
        String isElligible = (age>18) ? "Elligible To Vote" : "Not Elligible To Vote";
        System.out.println(isElligible);
    }
}
