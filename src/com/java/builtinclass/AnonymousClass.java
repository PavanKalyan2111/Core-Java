package com.java.builtinclass;

interface Demo{
    void display();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Demo obj = new Demo() {
            @Override
            public void display() {
                System.out.println("Implementing Interface Method with the help of Anonymous Class");
            }
        };
    obj.display();

    }
}
