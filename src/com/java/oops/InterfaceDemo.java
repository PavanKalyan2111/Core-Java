package com.java.oops;
interface ParentClass1{
    public void parent1(); //abstract method
    default void show(){
        System.out.println("Defining the method in interface 1 using default keyword prefix to the method");
    }
    static void display(){
        System.out.println("Static Method Implementation in Interface");
    }
}
interface ParentClass2{
    public void parent2(); //abstract method
    default void show(){
        System.out.println("Defining the method in interface 2 using default keyword prefix to the method");
    }
}
class ChildClass implements ParentClass1, ParentClass2{

    //ChildCLass is a Concrete class which defines the methods of declared methods in interface
    @Override
    public void parent1() {
        System.out.println("Parent1 Interface Class");
    }

    @Override
    public void parent2() {

        System.out.println("Parent2 Interface Class");
    }
    //Ambiguity will occur, to resolve this we create a method with same name and we call the superclass methods
    @Override
    public void show() {
        ParentClass1.super.show();
        ParentClass2.super.show();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.parent1();
        obj.parent2();
        obj.show();
        ParentClass1.display();
        
    }
}
