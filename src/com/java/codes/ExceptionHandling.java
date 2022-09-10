package com.java.codes;

class ExceptionClass{
    void method(){
        /* Unchecked Exceptions Handling */
        //ArithmeticException: / by zero
        try{
            int a = 5/0;
            System.out.println(a);
        }
        catch (Exception e){
            System.out.println(e);
        }
        //ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
        try {
            int[] array = new int[5];
            array[6] = 4;
        }
        catch (Exception e){
            System.out.println(e);
        }
        //NullPointerException
        try{
            String str = null;
            System.out.println(str.length());
        }
        catch (Exception e){
            System.out.println(e);
        }
        //NumberFormatException: For input string: "Text"
        try{
            String str = "Text";
            int a = Integer.parseInt(str);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Exceptions are Handled");
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
            ExceptionClass obj = new ExceptionClass();
            obj.method();
    }
}
