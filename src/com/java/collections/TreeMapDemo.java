package com.java.collections;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        //Tree Map will sort out the elements based on the key value
        TreeMap<Integer, String> treemap = new TreeMap<>();
        treemap.put(6,"A");
        treemap.put(8,"B");
        treemap.put(3,"C");
        treemap.put(2,"D");

        System.out.println(treemap);

    }
}
