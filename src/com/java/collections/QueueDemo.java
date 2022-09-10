package com.java.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String args[]){
        Queue<String> queue = new PriorityQueue<>();
        queue.add("India");
        queue.add("China");
        queue.add("Germany");
        queue.add("Europe");
        queue.add("America");

        System.out.println("Queue Elements are : "+queue); // we won't get sorted queue here

        //remove queue element from the queue, which removes head value
        System.out.println("Removed element from the Queue : "+queue.remove());
        //when we do some operations on queue and printing them it will give the sorted queue elements
        System.out.println("Queue after removing element : "+queue);

       String head = queue.peek();
        System.out.println("Head value of the Queue is : "+head);
    }
}
