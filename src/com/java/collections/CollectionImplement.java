package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionImplement {
    public static void main(String[] args) {
        Collection values = new ArrayList();
        values.add(1);
        values.add(3);
        values.add(5);

        System.out.println(values);
         //Iterator is used to iterate the values over the collection array
        Iterator it = values.iterator();

        //if hasNext => if collection has Next value it will print the value else it stops the loop
        while (it.hasNext()) {
            System.out.println(it.next()); //next value of collection will print
        }
    }
}
