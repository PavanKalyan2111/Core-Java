package com.java.builtinclass;
import java.util.*;

public class ArraysClass {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Skoda");
        cars.add("Tesla");
        cars.add("Hyundai");
        cars.add("Ferrari");
        cars.add("Jaguar");
        cars.add("Mercedes Benz");
        cars.add("Rolls Royce");
        cars.add(2,"Benz");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(1));
        System.out.println(cars.set(8,"Lamborghini"));
        System.out.println(cars.add("KIA"));
        System.out.println(cars.remove(3));
        System.out.println(cars);
        Collections.sort(cars); // to sort the array in ascending order which uses comparable interface(compareTo() method)
        Collections.reverse(cars); // to reverse the sorted array and making it as descending order
        System.out.println("Sorted Array Cars In Descending Order :");
        for (String i: cars) {
            System.out.println(i);
        }
    }
}
