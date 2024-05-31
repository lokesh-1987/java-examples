package com.java.examples;

public class MaxSubArraySumKadaneAlgo {

    public static void main(String[] args) {
        int[] arr = {1, -5, 8, 9, -2};
        maxSumOfSubArray(arr);
    }

    private static void maxSumOfSubArray(int[] arr) {

        int currentSum = 0;
        int maxSumOfSubArray = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            maxSumOfSubArray = Math.max(maxSumOfSubArray, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("maxSumOfSubArray : " + maxSumOfSubArray);
    }
}
