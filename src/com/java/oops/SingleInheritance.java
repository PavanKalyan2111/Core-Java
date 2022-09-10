package com.java.oops;

class Parent{
    void show(){
        System.out.println("Parent Class");
    }

}
class Child extends Parent{
    void display(){
        System.out.println("Child Class");
       // super.display();
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();


    }
}
