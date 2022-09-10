package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(523);
        values.add(459);
        values.add(687);

        /* if i want to sort the elements based on last digit of the value using Comparator */
     //   Comparator<Integer> comp = new Comparator<Integer>() {
      //      @Override
       //     public int compare(Integer i, Integer j) {
             /*   if (i%10 > j%10) // 404%10 > 523%10 => 4>3 which returns 1
                    return 1;
                else
                    return -1;
              */
          //      return i%10>j%10?1:-1; // Ternary Operator instead of if and else
      //      }
       // };

     //   Collections.sort(values, comp);
        Collections.sort(values, (i,j)-> i%10>j%10?1:-1); // lambda expression () -> ternary condition(a>b?1:-1)
        for (int i : values) {
            System.out.println(i);
        }

    }
}

