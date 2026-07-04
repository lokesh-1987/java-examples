package com.java.examples;

//return binary values from two arrays?
public class BinaryTwoArray {

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 7};
        int[] arr2 = {3, 6, 1};

        String[] binaryArray = binaryOr(arr1, arr2);
        for (String s : binaryArray) {
            System.out.println(s);
        }
    }

    private static String[] binaryOr(int[] arr1, int[] arr2) {
        int length = Math.min(arr1.length, arr2.length);
        String[] result = new String[length];
        for (int i = 0; i < length; i++) {
            int orValue = arr1[i] | arr2[i];
            result[i] = Integer.toBinaryString(orValue);
        }
        return result;
    }
}
