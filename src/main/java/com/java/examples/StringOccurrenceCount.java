package com.java.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
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


        Map<String, Long> mapCnt = str.chars()
                .mapToObj(Character::toString)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        System.out.printf("mapCnt : " + mapCnt + "\n");

        Map<Character, Integer> map1 = map.entrySet().stream().filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        System.out.printf("map1 " + map1 + "\n");


        String strNew = Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
        System.out.printf("strNew : " + strNew + "\n");

        long cnt = str.chars().filter(ch -> ch == 'g').count();
        System.out.printf("cnt : " + cnt + "\n");

    }
}
