package com.java.examples;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4};
        System.out.println("missing Number In An Array : "+missingNumberInAnArray(arr, 5));

        System.out.println("missing Number In An Array Using ExOr : " +missingNumberInAnArrayUsingExOr(arr, 5));
    }

    private static int missingNumberInAnArrayUsingExOr(int[] arr, int arrayLength) {
        int result = 0;

        //ExOR for nth natural number
        for (int i = 1; i <= arrayLength; i++) {
            result ^= i;
        }

        // ExOr for all array elements
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }

        return result;
    }

    private static int missingNumberInAnArray(int[] arr, int arrayLength) {

        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        int sumOfNthNaturalNumber = arrayLength * (arrayLength + 1) / 2;

        return sumOfNthNaturalNumber - sum;
    }
}
