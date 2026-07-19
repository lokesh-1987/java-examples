package com.java.examples;

import java.util.*;
import java.util.stream.Collectors;

public class StringOccurrenceCount {

    public static void main(String[] args) {

        String str = "jhghghkgkgkg";

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.printf("map : " + map + "\n");

        Map<Character, Long> mapCnt = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.printf("mapCnt : " + mapCnt + "\n");

        //
        Map<Character, Long> mapCnt1 = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()));
        System.out.printf("mapCnt1 : " + mapCnt1 + "\n");

        Character c1 = mapCnt1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("First non-repetitive Char : "+c1);
        //

        Character c3 = mapCnt1.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .limit(3)
                .skip(1)
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("Third most non-repetitive Char : "+c3);

        Character c = mapCnt1.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey)
                .findFirst().orElse(null);
        System.out.println("First non-repetitive Char : "+ c);

        Map<Character, Integer> map1 = map.entrySet().stream().filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        System.out.printf("map1 " + map1 + "\n");


        String strNew = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.printf("strNew : " + strNew + "\n");

        long cnt = str.chars().filter(ch -> ch == 'g').count();
        System.out.printf("cnt : " + cnt + "\n");

    }
}
