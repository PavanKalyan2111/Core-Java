package com.javaprograms;

import org.w3c.dom.ls.LSOutput;

import  java.lang.Math;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumber {
    //Random number using Math class
    public static void main(String[] args) {
        int min=50, max=200;
        double random = Math.random(); // which gives between 0.0 to 1.0
        double random1 = Math.random()*100; // which gives between 0.00 to 100.00
        int random2 = (int) (Math.random()*100); // which gives 0 to 100 using typecasting
        int random3 = (int) (Math.random()*(max-min+1)+min);  // which gives 50 to 200 using typecasting
        System.out.println(random);
        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

       // Random numbers using Random Class
        Random randomClassObj = new Random();

       int x = randomClassObj.nextInt(50);
       double y = randomClassObj.nextDouble();
        System.out.println(x);
        System.out.println(y);

    }


}
