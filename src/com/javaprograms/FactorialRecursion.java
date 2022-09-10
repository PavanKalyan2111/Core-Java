package com.javaprograms;
class FactorialValue {
   static int Factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return(n* Factorial(n - 1));
        }
    }
}

    class FactorialRecursion {
        public static void main(String[] args) {
            FactorialValue obj = new FactorialValue();
            System.out.println("Factorial is "+obj.Factorial(5));
        }
    }

