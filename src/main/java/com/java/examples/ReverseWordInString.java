package com.java.examples;

public class ReverseWordInString {

    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println(reverseWordInString(s));
    }

    private static String reverseWordInString(String s) {
        String[] s1 = s.split(" ");

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s1.length; i++) {
            stringBuilder.append(s1[s1.length - (i + 1)]).append(" ");
        }
        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
