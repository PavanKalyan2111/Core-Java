package com.java.builtinclass;

public class MathClass {
    public static void main(String[] args) {
        int min = Math.min(20,40);
        int max = Math.max(20,50);
        int roundedvalue = Math.round(9.21f);
        int floorvalue = (int) Math.floor(84.322d);
        double randomvalue =  Math.random();
        int randomval = (int) Math.round(Math.random()*100);
        System.out.println(min);
        System.out.println(max);
        System.out.println(roundedvalue);
        System.out.println(floorvalue);
        System.out.println(randomvalue);
        System.out.println(randomval);

    }
}
