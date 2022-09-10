package com.java.codes;

public class TypeCasting {
    public static void main(String[] args) {
        /* Implicit TypeCasting => byte > short > int > long > float > double  */
        double x= 10.45;
        int y = (int) x; // typecasting double variable value to the int value variable
        short p = 4;
        int q = p; // Implicit Typecasting of short to int
        String a = "30";
        int b = Integer.parseInt(a); // typecasting string to int
        short c = Short.parseShort(a);  // typecasting string to short
        double d = Double.parseDouble(a); // typecasting string to double
        float f = Float.parseFloat(a);  // typecasting string to float
        System.out.println("Double Value "+x);
        System.out.println("typecasting double to int "+y);
        System.out.println("String Value "+a);
        System.out.println("typecasting string to int "+b);
        System.out.println("typecasting string to short "+c);
        System.out.println("typecasting string to double "+d);
        System.out.println("typecasting string to float "+f);
        System.out.println("Implicit Typecasting of short to int "+q);

    }
}
