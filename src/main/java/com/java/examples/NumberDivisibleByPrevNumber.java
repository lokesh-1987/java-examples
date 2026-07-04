package com.java.examples;

import java.util.HashSet;
import java.util.Set;

//Given array (eg 2, 4,3,6) divide second number by previous number. Resultant numbers will have to be put in array. How many number are divisible
//by previous numbers
//
//Array (2, 4, 3, 6)
//
//4/2 -reminder 0
//        3/4 -reminder  1
//        6/3 -reminder 0
public class NumberDivisibleByPrevNumber {

    public static void main(String[] args) {
        int[] nos = new int[]{2, 4, 8, 3, 6, 12, 24, 8};

        int cnt = totalCountDivisibleByPrevNumber(nos);
        System.out.println(cnt);
    }

    private static int totalCountDivisibleByPrevNumber(int[] nos) {

        Set<Integer> resultSet = new HashSet<>();
        int cnt = 0;

        for (int i = 1; i < nos.length; i++) {

            if (nos[i] % nos[i - 1] == 0) {
                resultSet.add(nos[i]);
                cnt++;
            }
        }
        System.out.println(resultSet);
        return cnt;
    }
}
