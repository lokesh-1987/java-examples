package com.java.examples;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        firstNonRepeatingChar("leetcode");
    }

    private static void firstNonRepeatingChar(String str) {
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
