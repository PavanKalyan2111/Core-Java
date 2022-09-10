package com.java.codes;
class ThisExample{
    int a =10; //Instance Varibale
    void display(){
        int a = 30; //Local Varibale
        System.out.println("Local varibale Value : "+a); // it will print the local varibale balue which is a = 30
        System.out.println("Instance Variable Value : "+this.a); // it will print the immediate instance variable of a class which is a =10
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        ThisExample t = new ThisExample();
        t.display();

    }
}
