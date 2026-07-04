package com.java.examples;

import java.util.Arrays;

//Time or Space Complexity = O(N)
public class WaveArray {

    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 3, 5, 4, 1};
        int[] arr = new int[]{10, 90, 49, 2, 1, 5, 23};

        formWaveArray(arr);
    }

    private static void formWaveArray(int[] arr) {

        int i = 0;
        int tmp;

        while (i < arr.length) {

            if (i < arr.length - 1 && arr[i + 1] > arr[i]) {
                //swap
                tmp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = tmp;
            }

            if (i > 0 && arr[i - 1] > arr[i]) {
                //swap
                tmp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = tmp;
            }
            i = i + 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
