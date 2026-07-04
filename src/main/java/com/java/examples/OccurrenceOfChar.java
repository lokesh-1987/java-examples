package com.java.examples;

//Input: "aaabbcccddeeeaabd"
//Output: "a3b2c3d2e3a2b1d1"
public class OccurrenceOfChar {

    public static void main(String[] args) {
        String s = "aaabbcccddeeeaabd";
        occurrenceOfChar(s);
        occurrenceOfChar1(s);
    }

    private static void occurrenceOfChar1(String s) {
        int minConsecutiveLength = 1;
        int maxConsecutiveLength = 1;
        StringBuilder newStr = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                minConsecutiveLength++;
                maxConsecutiveLength = Math.max(maxConsecutiveLength, minConsecutiveLength);
            } else {
                newStr.append(s.charAt(i - 1)).append(maxConsecutiveLength);
                minConsecutiveLength = 1;
                maxConsecutiveLength = 1;
            }
            if (s.length() - 1 == i) {
                newStr.append(s.charAt(i)).append(maxConsecutiveLength);
            }
        }
        System.out.println(newStr);
    }

    private static void occurrenceOfChar(String s) {
        int cnt = 1;
        int i = 1;
        StringBuilder str = new StringBuilder();
        for (i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                str.append(s.charAt(i - 1)).append(cnt);
                cnt = 1;
            } else {
                cnt++;
            }
        }
        if (i == s.length()) {
            str.append(s.charAt(i - 1)).append(cnt);
        }
        System.out.println(str);
    }
}
