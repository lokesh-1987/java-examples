package com.java.examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class FreqOfChars {

    public static void main(String[] args) {
        firstNonRepeatingChar("leetcode");
    }

    private static void firstNonRepeatingChar(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();


        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        map.forEach((k, v) -> System.out.println(k + " : "+v));
        Optional<Map.Entry<Character, Integer>> entry = map.entrySet().stream().filter(e -> e.getValue() == 1).findFirst();
        System.out.println(entry);

        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println("character: " + str.charAt(i) + " freq :" + freq[str.charAt(i) - 'a']);
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                System.out.println("First non-repeating character: " + str.charAt(i));
                return;
            }
        }
        System.out.println("There are no non-repeating characters in the string.");
    }
}
