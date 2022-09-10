package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        // <Integer> is a generic which specifies that list should contain integer values only
        List<String> names = new ArrayList<String>();
        // <String> is a generic which specifies that list should contain string values only
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        names.add("Pavan Kalyan");
        names.add("Vijay");
        names.add("Srivani");
        names.add("Srinu");
        System.out.println(values);
        System.out.println(names);
        System.out.println("Values using For Each loop through integer generic type");
        for (int i: values) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Names using For Each loop through string generic type");
        for (String str: names) {
            System.out.print(str+" ");
        }
    }
}
