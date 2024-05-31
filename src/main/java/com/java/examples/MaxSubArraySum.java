package com.java.examples;

public class MaxSubArraySum {

    public static void main(String[] args) {
        int[] arr = {1, -5, 8, 9, -2};
        maxSumOfSubArray(arr);
    }

    private static void maxSumOfSubArray(int[] arr) {

        int maxSumOfSubArray = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum > maxSumOfSubArray) {
                    maxSumOfSubArray = currentSum;
                }
            }
        }
        System.out.println("maxSumOfSubArray : " + maxSumOfSubArray);
    }
}
