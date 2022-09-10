package com.java.programs;
import java.lang.Thread; //no need to include this package default it takes
class Parent_Class{

}

class Hi extends Parent_Class implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Hi");
        }

    }

}
class Hello implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Hello");
        }
    }

}
public class ThreadsInterface {
    public static void main(String[] args) {
        Thread t1 = new A();
        Thread t2 = new B();
        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e){}
        t2.start();

    }
}
