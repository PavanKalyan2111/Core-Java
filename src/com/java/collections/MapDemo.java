package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        System.out.println("Map Values are :");
        System.out.println(map);
        System.out.println(map.size());

        //To check whether the key value is present or not
        if(map.containsKey("a")){
            System.out.println("Value of Key \"a\" is "+map.get("a"));
        }
        //To print all the values by iterating through keys
        for (String key: map.keySet()) {
            System.out.println("Key : "+key+" Value is " + map.get(key));
        }
        //To print all the values by iterating through keys using entry values
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("Key is : "+entry.getKey()+ " Value is : " +entry.getValue());
        }
    }
}
