package com.java.examples;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveChars {

    public static void main(String[] args) {
        String s = "aabcdeenrrrr";
        maxConsecutiveCharsLength(s);
    }

    private static void maxConsecutiveCharsLength(String s) {

        Map<Character, Integer> map = new HashMap<>();

        int count = 1;
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) == s.charAt(++i)) {
                map.put(s.charAt(i), ++count);
            } else {
                count = 1;
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println("cosecutive repetative chars count" + map);
    }
}
