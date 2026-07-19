package com.java.examples;

public class MaxConsecutiveChars {

    public static void main(String[] args) {
        String s = "aabcdeenarrrr";
        String s1 = "1235757877777";
        int maxConsecutiveLength = maxConsecutiveCharsLength(s);
        System.out.println(maxConsecutiveLength);
    }

    private static int maxConsecutiveCharsLength(String s) {

        int maxConsecutiveLength = 1;
        int minConsecutiveLength = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                minConsecutiveLength++;
                maxConsecutiveLength = Math.max(maxConsecutiveLength, minConsecutiveLength);
            } else {
                minConsecutiveLength = 1;
            }
        }
        return maxConsecutiveLength;
    }
}
