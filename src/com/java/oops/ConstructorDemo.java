package com.java.oops;

class TestDemo{
    //Constructor 1
    TestDemo(){
        String Name ="Default Constructor";
        System.out.println(Name);
    }
    //Constructor 2
    TestDemo(String stringValue){

        System.out.println(stringValue);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        TestDemo obj = new TestDemo(); //creating object
        TestDemo obj1 = new TestDemo("Parameterized Constructor");

    }
}
