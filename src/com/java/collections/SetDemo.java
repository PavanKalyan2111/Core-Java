package com.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set will not contain duplicate values
      //  Set<Integer> values = new HashSet<>(); //HashSet will have values stored in random manner so output will be random
        Set<Integer> values = new TreeSet<>(); //TreeSet will return the sorted values

        //these lines will return boolean type (true or false) if value added it returns true else false
        System.out.println(values.add(34));
        System.out.println(values.add(22));
        System.out.println(values.add(63));
        System.out.println(values.add(41));
        System.out.println(values.add(22)); // it is a duplicate value so it won't print and returns false

        System.out.println(values);

        //Iterating set values using foreach loop
        for (Integer i: values) {
            System.out.print(i+" ");

        }


    }
}
