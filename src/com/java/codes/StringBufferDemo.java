package com.java.codes;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello Java");
        System.out.println(str.length());
        System.out.println(str.append(" Programmer"));
        System.out.println(str.indexOf("e"));
        System.out.println(str.insert(5,"Welcome TO"));
        System.out.println(str.delete(10,13));
        System.out.println(str.charAt(4));
        System.out.println(str.reverse());
        System.out.println(str.replace(5, 10, "Replace"));
        System.out.println(str.substring(3));
        System.out.println(str.subSequence(4,8));
    }
}
