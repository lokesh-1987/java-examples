package com.java.examples;

import java.util.HashSet;
import java.util.Set;

public class PairSumFinder {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        int target = 7;

        pairSumFinder(arr, target);
    }

    private static void pairSumFinder(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<String> printed = new HashSet<>();

        for (int no : arr) {
            int diff = target- no;
            if (seen.contains(no)) {
                int min = Math.min(no, diff);
                int max = Math.max(no, diff);
                String pair = min + ","+max;
                printed.add(pair);
            }
            seen.add(no);
        }

        System.out.println(printed);
    }
}
