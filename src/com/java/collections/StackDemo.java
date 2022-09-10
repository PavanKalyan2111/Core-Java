package com.java.collections;

import java.util.Collections;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mahesh Babu");
        stack.push("Pavan Kalyan");
        stack.push("NTR");
        stack.push("Ram Charan");
        stack.push("Vijay");
        stack.push("Surya");
        stack.push("Vikram");
        Collections.sort(stack); //It will sort the stack
        System.out.println("Original Stack is : "+stack);

        String poppedElement = stack.pop(); //It will popout the last element of a stack
        System.out.println("Popped Element is : "+poppedElement);
        System.out.println("Now Current Stack is : " +stack);

        String peekElement = stack.peek();
        System.out.println("Peek element of the stack is :"+peekElement);

        System.out.println("Index of 3 in a stack having element : "+stack.get(3));

        System.out.println("Size of the Stack is : "+stack.size());

        System.out.println("Search Value is : "+stack.search("NTR")); //It will find the element from the top of the stack


    }
}
