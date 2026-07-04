package com.java.examples;

public class MaxConsecutiveChars {

    public static void main(String[] args) {
        String s = "aabcdeenarrrr";
        String s1 = "1235757877777";
        int maxConsecutiveLength = maxConsecutiveCharsLength(s1);
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
//        Map<Character, Integer> map = new HashMap<>();
//
//        int count = 1;
//        int i = 0;
//        while (i < s.length() - 1) {

//            if (s.charAt(i) == s.charAt(++i)) {
//                map.put(s.charAt(i), ++count);
//            } else {
//                if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) > count) {
//                    map.put(s.charAt(i), map.get(s.charAt(i)));
//                } else {
//                    map.put(s.charAt(i), 1);
//                    count = 1;
//                }
//
//            }
//        }
//        System.out.println("cosecutive repetative chars count" + map);
    }
}
