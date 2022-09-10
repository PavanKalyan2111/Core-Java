package com.java.oops;

class Parent1{
    void display(){
        System.out.println("Parent Class");

    }

}
class Child1 extends Parent1{
    void show(){
        System.out.println("Child1 Class");
    }

}
class Child2 extends Child1{
    void popup(){
        System.out.println("Child2 Class");
    }

}

public class MultiLevelIheritance {
    public static void main(String[] args) {
        Child2 obj = new Child2();
        obj.display();
        obj.show();
        obj.popup();

    }
}
