package com.java.codes;

public class StringsDemo {
    public static void main(String[] args) {
       // String str = new String("Welcome TO Java");
        String str = "Welcome To Java ";
        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf("To"));
        System.out.println(str.charAt(3));
        System.out.println(str.replace("Java","JavaSE"));
        System.out.println(str.trim());
        System.out.println(str.compareTo("Welcome"));
        System.out.println(str.concat("Programming !!"));
        System.out.println(str.endsWith("Java"));
        System.out.println(str.startsWith("Welcome"));
    }
}
