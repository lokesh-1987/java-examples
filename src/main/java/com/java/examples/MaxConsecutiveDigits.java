package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveDigits {

    public static void main(String[] args) {
        int number = 1133456666;
        maxConsecutiveDigits(number);
    }

    private static void maxConsecutiveDigits(int number) {

        Map<Integer, Integer> map = new HashMap<>();
        int count = 1;
        int currentNumber = number / 10;
        int prevDigit = number % 10;

        while (currentNumber > 0) {
            int currentDigit = currentNumber % 10;
            if (currentDigit == prevDigit) {
                map.put(currentDigit, ++count);
            } else {
                count = 1;
                map.put(currentDigit, 1);
            }
            prevDigit = currentDigit;
            currentNumber = currentNumber / 10;
        }

        System.out.println("cosecutive repetative digits count" + map);
    }
}
