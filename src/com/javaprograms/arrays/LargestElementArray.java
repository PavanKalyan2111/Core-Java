package com.javaprograms.arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] array = {20,43,175,34,95};
        int max = array[0];
        for (int i = 0; i <array.length; i++) {
            if(array[i]>max){
             max = array[i];
            }
        }
        System.out.println("Maximum element in an array is : "+max);
    }
}
