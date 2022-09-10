package com.java.codes;

class OuterClass{
    void show(){
        System.out.println("In Show");
    }
    class InnerClass{
        void display(){
            System.out.println("In Display");
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {
        OuterClass obj = new OuterClass();
        obj.show();
        OuterClass.InnerClass obj1 = obj.new InnerClass();
        obj1.display();

    }
}
