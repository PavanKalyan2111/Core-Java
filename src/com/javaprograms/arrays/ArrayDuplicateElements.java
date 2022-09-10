package com.javaprograms.arrays;

public class ArrayDuplicateElements {
    public static void main(String[] args) {
        int[] array = {1,3,6,8,2,4,9, 4,5,2,7,3,1};
        System.out.println("Duplicate Elements in an Array : ");
        for (int i = 0; i <array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]){
                    System.out.print(array[j]+" ");
                }
            }
        }
    }
}
