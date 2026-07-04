package com.java.examples;


import java.util.*;

//Group Anagrams - Given an array of strings strs, group the anagrams together.
//
//        Input = ["eat","tea","tan","ate","nat","bat"]
//
//Output - [[eat, tea, ate], [bat], [tan, nat]]
//
public class ValidateAnagramGroup {

    public static void main(String[] args) {

        String[] str = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        List<List<String>> lists = findGroupOfAnagrams(str);
        List<List<String>> lists = findGroupOfAnagrams1(str);

        System.out.println(lists);
    }

    private static List<List<String>> findGroupOfAnagrams1(String[] str) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            System.out.println(sArray);
            String sortedKey = String.valueOf(sArray);
            if (map.containsKey(sortedKey)) {
                List<String> group1 = map.get(sortedKey);
                group1.add(s);
                map.put(sortedKey, group1);
            } else {
                List<String> group = new ArrayList<>();
                group.add(s);
                map.put(sortedKey, group);
            }
        }

        return new ArrayList<>(map.values());
    }

    private static List<List<String>> findGroupOfAnagrams(String[] str) {

        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
            String s1 = new String(chars);
//            map.computeIfAbsent(s1, s2 -> new ArrayList<>()).add(s);

            List<String> group = map.get(s1);
            if (group == null) {
                group = new ArrayList<>();
                map.put(s1, group);
            }
            group.add(s);
        }
        return new ArrayList<>(map.values());
    }
}

