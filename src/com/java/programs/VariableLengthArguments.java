package com.java.programs;

class Calculator{
     int add(int ... n) //{4,5,8,9} => Variable Length Arguments
     {
        int sum = 0;
        for(int i: n){
            sum = sum+i;
        }
        return sum;
    }
}

public class VariableLengthArguments {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(4,5,8,9));

    }
}
