package com.javaprograms.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.print("Original Array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Reverse of an Array : ");
        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]+" ");
        }
    }

}
