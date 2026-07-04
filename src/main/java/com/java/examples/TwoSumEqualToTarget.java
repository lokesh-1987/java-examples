package com.java.examples;

import java.util.*;

//needs to return indexes whose indexes-element sum is equal to target.
public class TwoSumEqualToTarget {

    public static void main(String[] args) {
        int[] arr = new int[]{-1, 0, 2, 1, -4};
        int targetSum = 0;
        calculate2SumToTarget(arr, targetSum);
    }

    private static void calculate2SumToTarget(int[] arr, int targetSum) {

        Map<Integer, Integer> map = new HashMap<>();
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int complementNumber = targetSum - arr[i];
            if (map.containsKey(complementNumber)) {
                result.add(Arrays.asList(map.get(complementNumber), i));
            }
            map.put(arr[i], i);
        }
        System.out.println(result);
    }
}
