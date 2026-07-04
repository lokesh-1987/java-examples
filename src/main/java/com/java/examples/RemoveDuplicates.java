package com.java.examples;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 4, 5};

        int[] ar = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(ar));

        System.out.println("removed duplicate elements :" + removeDuplicates(arr));

        int[] a = new int[] { 1, 1, 2, 3, 3, 4, 4};
        removeDuplicatesInSortedArray(a);
    }

    private static void removeDuplicatesInSortedArray(int[] a) {
        Arrays.sort(a);
        int k = 0;
        for (int i = 1; i< a.length; i++) {
            if (a[k] != a[i]) {
                k++;
                a[k] = a[i];
            }
        }
        System.out.println("non-duplicate array left side : "+ Arrays.toString(Arrays.stream(a).toArray()));
        System.out.println("non-duplicate array length : " + (k+1));
        System.out.println("non-duplicate array : "+ Arrays.toString(Arrays.copyOfRange(a, 0, k+1)));
    }

    private static String removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return Arrays.toString(set.toArray());
    }
}
