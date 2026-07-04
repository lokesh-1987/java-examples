package com.java.examples;

//Return highest odd and even number from given array?
public class MaxHighestEvenOddNumber {

    public static void main(String[] args) {

        int[] nos = new int[]{2, 39, 5, 6, 33, 25};

        findHighestEvenOddNumber(nos);
    }

    private static void findHighestEvenOddNumber(int[] nos) {

        int maxHighestEvenNo = 1;
        int maxHighestOddNo = 1;
        for (int no : nos) {
            if (no % 2 == 0) {
                maxHighestEvenNo = Math.max(no, maxHighestEvenNo);
            } else {
                maxHighestOddNo = Math.max(no, maxHighestOddNo);
            }
        }
        System.out.println("maxHighestEvenNo : "+maxHighestEvenNo);
        System.out.println("maxHighestOddNo :"+maxHighestOddNo);

    }
}
