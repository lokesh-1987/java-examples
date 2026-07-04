package com.java.examples;

//Given an array with positive & negative numbers and multiply all numbers and return like below
//Positive-1
//Negative- -1
//Zero-0
public class ResultantNoPositiveOrNegativeOrZero {

    public static void main(String[] args) {
        int [] nos = new int[] { 1, 2, 7, -9, -4};

        int n = findResultantNumber(nos);
        System.out.println(n);
    }

    private static int findResultantNumber(int[] nos) {

        int mult = 1;
        for (int no : nos) {
            mult *= no;
        }

        if (mult > 0) {
            return 1;
        } else if (mult < 0) {
            return -1;
        }
        return 0;
    }
}
