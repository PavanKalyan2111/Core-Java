package com.java.oops;
//Abstract Class 1
abstract class AbstractDemo{
    abstract void demo();
}
//Abstract Class 2
abstract class AbstractSample extends AbstractDemo{
    abstract void sample();

    @Override
    void demo() {
        System.out.println("Abstract Demo Class");
    }
}
//Concrete Class
class Abstraction extends AbstractSample{
    @Override
    void sample() {
        System.out.println("Abstract Sample Class");
    }
}

public class AbstarctClass {
    public static void main(String[] args) {
        Abstraction obj = new Abstraction();
        obj.sample();
        obj.demo();

    }
}
