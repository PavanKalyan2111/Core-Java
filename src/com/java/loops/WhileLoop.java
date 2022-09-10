package com.java.loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        int i=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        while(i<=n){
            System.out.println("While Loop Running..."+i);
            i++;
        }
    }
}
