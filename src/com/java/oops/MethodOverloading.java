package com.java.oops;

class Overload{
    //default method
    void Testing(){
        int a=10;
        int b = 20;
        System.out.println("Addition of a&b is = "+(a+b));

    }
    //Parameterized Method
    void Testing(int x, int y){
        System.out.println("Addition of x&y is = "+(x+y));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Overload obj = new Overload(); // creating an object
        obj.Testing();// it will call the default method
        obj.Testing(5,8); // it will call the parameterized method

    }
}
