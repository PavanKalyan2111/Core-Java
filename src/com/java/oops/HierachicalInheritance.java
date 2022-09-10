package com.java.oops;

class ParentClass{
    void display(){
        System.out.println("ParentClass");
    }

}
class Child1class extends ParentClass{
    void show(){
        System.out.println("Child1Class");
    }

}
class Child2Class extends ParentClass{
    void popup(){
        System.out.println("Child2Class");

    }

}

public class HierachicalInheritance {
    public static void main(String[] args) {
        Child2Class obj = new Child2Class();
        obj.display();
        obj.popup();
        Child1class obj2 = new Child1class();
        obj2.show();
        obj2.display();
    }
}
