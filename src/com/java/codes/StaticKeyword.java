package com.java.codes;

class DemoClass{
    //static Variables which we can access anywhere in any class without creating the object, we can call with the classname.variablename
   static int number = 21;
   static String name = "Pavan";

   //static method
   static void staticMethod(){

        System.out.println("static method number : "+number);
        System.out.println("static method name : "+name);
    }
    // static block
    static {
        System.out.println("Static Block which prints first");
    }

}
public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println("main method number : "+DemoClass.number);
        System.out.println("main method name : "+DemoClass.name);
        DemoClass.staticMethod();

    }
}
