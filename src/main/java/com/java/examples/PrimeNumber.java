package com.java.examples;

//prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...
public class PrimeNumber {

    public static void main(String[] args) {
        primeNumber(11);
    }

    private static void primeNumber(int number) {

        boolean flag = true;

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Number is prime : " + number);
        } else {
            System.out.println("Number is not prime : " + number);
        }
    }
}
