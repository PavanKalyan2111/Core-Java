package com.java.programs;

class A extends Thread{
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
class B extends Thread{
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
public class ThreadsDemo{
    public static void main(String[] args)   throws Exception {
        Hi obj = new Hi();
        Hello obj1 = new Hello();
        Thread t1 = new Thread(obj,"Hi Thread");
        Thread t2 = new Thread(obj1,"Hello Thread");
       // t1.setName("Hi Thread");
        // t2.setName("Hello Thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        /*MIN_PRIORITY =1, NORM_PRIORITY = 5, MAX_PRIORITY = 10 */
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority()); // initially priority of thread is Normal = 5
        System.out.println(t2.getPriority());
        t1.start();
        try {
            Thread.sleep(10);
            System.out.println("Thread Hi is Alive : "+t1.isAlive());
        }
        catch (Exception e){}
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Thread Hi is Alive : "+t1.isAlive());
        System.out.println("End of the Execution, Bye...");

    }
}
