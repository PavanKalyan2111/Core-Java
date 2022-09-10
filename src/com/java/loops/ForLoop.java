package com.java.loops;

import java.util.Scanner;

public class ForLoop extends Thread {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //user input
        System.out.print("Enter Value of n : ");
        int n= sc.nextInt(); //initializing user input value n
        for (int i=1; i<=n; i++){
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Checking Loop Statement..." + i);
        }
    }
}
