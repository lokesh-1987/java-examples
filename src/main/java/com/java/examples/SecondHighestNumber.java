package com.java.examples;

public class SecondHighestNumber {

    public static void main(String[] args) {
        int[] nos = {22,45,54,98,28,99,65,79};
        System.out.println(secondLargestNo(nos));
    }

    private static int secondLargestNo(int[] nos) {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int i : nos) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }
        }
        return secondHighest;
    }
}
