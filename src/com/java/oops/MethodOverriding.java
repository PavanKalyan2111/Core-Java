package com.java.oops;
class ClassOne{
    void display(){

        System.out.println("Class 1");
    }
}
class ClassTwo extends ClassOne{

    @Override
    void display() {
        System.out.println("Class 2");
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        ClassTwo obj = new ClassTwo();
        obj.display();
    }
}
