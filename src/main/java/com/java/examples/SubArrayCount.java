package com.java.examples;

public class SubArrayCount {

    public static void main(String[] args) {
        int[] arr = {1, -5, 8, 9, -2};
        subArrayCount(arr);
    }

    private static void subArrayCount(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                count++;
            }
        }
        System.out.println("SubArray Count : " + count);
    }
}