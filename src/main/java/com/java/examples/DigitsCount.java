package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class DigitsCount {

    public static void main(String[] args) {
        System.out.println(digitsCount(6888));
    }

    private static Map<Integer, Integer> digitsCount(Integer number) {

        Map<Integer, Integer> map = new HashMap<>();

        while (number != 0) {
            int num = number%10;
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            number = number/10;
        }
        System.out.println("Total no of digits : "+map.values().stream().mapToInt(Integer::intValue).sum());
        return map;
    }
}