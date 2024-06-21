package com.java.examples;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        System.out.println("removed duplicate elements :" + Arrays.toString(set.toArray()));
    }
}
