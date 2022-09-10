package com.java.codes;

public class Logical {
    public static void main(String[] args) {
       /* boolean a= true;
        boolean b= false;
        //Logical Operators &&, ||
        System.out.println(a && b);
        System.out.println(a || b);
        */
        boolean hasHighIncome = true;
        boolean hasGoodCreditScore = true;
        boolean hasCriminalRecord = false;
        boolean isElligible = (hasHighIncome || hasGoodCreditScore) && !hasCriminalRecord;
        System.out.println(isElligible);
    }
}
