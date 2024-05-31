package com.java.examples;

public class ValidatePalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }

    private static boolean isPalindrome(String s1) {

        StringBuilder s2 = new StringBuilder();

        for (int i = s1.length() - 1; i >= 0; i--) {
            s2.append(s1.charAt(i));
        }
        return s2.toString().equals(s1);
    }
}
