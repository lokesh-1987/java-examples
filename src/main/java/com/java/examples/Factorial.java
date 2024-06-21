package com.java.examples;

public class Factorial {

    public static void main(String[] args) {
        calculateFactorial(6);
    }

    private static void calculateFactorial(int num) {

        long fact = 1;
        for (int i = 1; i<=num; i++) {
            fact *= i;
        }
        System.out.println("factorial : "+fact);
    }
}
