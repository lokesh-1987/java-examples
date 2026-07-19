package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumberInAnArray {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4};
        System.out.println("missing Number In An Array : "+missingNumberInAnArray(arr, 5));
        System.out.println("missing Number In An Array : "+missingNumberInAnArray1(arr, 5)); //handles duplicates as well in an array

        System.out.println("missing Number In An Array Using ExOr : " +missingNumberInAnArrayUsingExOr(arr, 5));
    }

    private static List<Integer> missingNumberInAnArray1(int[] arr, int i) {

        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        return IntStream.rangeClosed(min, max).boxed()
                .filter(e -> !set.contains(e))
                .toList();
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
