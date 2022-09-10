package com.java.codes;

public class Unary {
    public static void main(String[] args) {
        int a = 2;
        int postfixvalue = a++; // value 2 and incremented to 3
        int prefixvalue = ++a; // 3 incremented to 4
        int postvalue = a--; // 4 printed and decremented to 3
        int prevalue = --a; // value 3 decremented to 2

        // Unary => Postfix and Prefix operators
        System.out.println(postfixvalue);
        System.out.println(prefixvalue);
        System.out.println(postvalue);
        System.out.println(prevalue);
    }
}
