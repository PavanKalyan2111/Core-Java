package com.java.builtinclass;

import java.text.NumberFormat;

public class NumberFormatClass {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(2456789.8964);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String value = percent.format(0.1);
        System.out.println(result);
        System.out.println(value);
    }
}