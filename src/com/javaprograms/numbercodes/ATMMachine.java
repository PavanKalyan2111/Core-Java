package com.javaprograms.numbercodes;

import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {

        int balance = 5000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.println("Welcome to the ATM Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Checking Balance");
            System.out.println("Choose 4 for Exit");
            System.out.print("Choose the Operation you want to perform : ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to withdraw : ");
                withdraw = sc.nextInt();
                if(balance>=withdraw){
                    balance = balance-withdraw;
                    System.out.println("Amount of rupees "+withdraw+ " has been withdrawn");
                }
                else
                    System.out.println("Insufficient Balance");
                System.out.println();
                break;
            case 2:
                System.out.print("Enter Deposit Amount : ");
                deposit = sc.nextInt();
                balance = balance+deposit;
                System.out.println("The amount of rupees "+deposit+ " has been deposited successfully!!");
                System.out.println();
                break;
            case 3:
                System.out.println("The current balance in your account is : "+balance);
                System.out.println();
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("You have entered invalid choice, please try again!...");
        }
    }
}
}
