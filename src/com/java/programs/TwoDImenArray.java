package com.java.programs;

public class TwoDImenArray {
    public static void main(String[] args) {

        int[][] numbers = { {1,2,3,4},
                            {5,6,7},
                            {8,9}
                                };
        //for loop

        for(int i=0; i<numbers.length; i++){
            for (int j=0;j<numbers[i].length; j++){
                System.out.print(" "+numbers[i][j]);
            }
            System.out.println();
        }
        //Enhanced for loop or For each loop
        for (int[] p: numbers){
            for (int q: p){
                System.out.print(" "+q);
            }
            System.out.println();
        }

    }
}
