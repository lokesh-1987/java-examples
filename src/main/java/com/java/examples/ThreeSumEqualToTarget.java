package com.java.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//a+b+c=T
//a+b+c=0
//a+b=-c
//needs to return indexes element sum is equal to target
public class ThreeSumEqualToTarget {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};
        int targetSum = 0;
        calculate3SumToTarget(arr, targetSum);
    }

    private static void calculate3SumToTarget(int[] arr, int targetSum) {

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                if (arr[i] + arr[j] + arr[j + 1] == targetSum) {
                    result.add(Arrays.asList(arr[i], arr[j], arr[j + 1]));
                }
            }
        }
        System.out.println(result);
    }
}