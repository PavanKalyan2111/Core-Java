package com.java.loops;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Mango"};
   /*     for(int i=0; i<=fruits.length; i++){
            System.out.println("For loop Array Fruits : "+fruits[i]);
        }
        */
    for(String fruit : fruits)
            System.out.println("For Each loop Array Fruits : "+fruit);
    }
}
