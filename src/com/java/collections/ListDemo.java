package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(2); /*Here the value of 2 is Integer class object like Integer v = new Integer(2),
        its not int 2(primitive data type) */

        numbers.add(4);
        numbers.add(6);
        numbers.add(2,8);

        System.out.println(numbers);

        System.out.println("Using For Loop");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("Using For Each Loop of type Object");
        for (Object p: numbers) {
            System.out.println(p);
        }
    }
}
