package com.java.examples;

import java.util.Arrays;

public class ValidateAnagram {

    public static void main(String[] args) {
        System.out.println(anagram("listen", "silent"));
    }

    private static boolean anagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for (int i = 0; i < chars1.length; i++) {
            if (chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
}
