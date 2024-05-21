package com.java.examples;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapIteration {

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Lokesh", 1, "Jac", 2);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.printf("key : "+entry.getKey()+ " Value : "+entry.getValue());
            System.out.printf("\n");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        map.forEach((k, v) -> System.out.println("Key :" + k + " value : " + v));

        map.keySet().forEach(k -> System.out.println((k + ":" + map.get(k))));

        map.values().forEach(v -> System.out.println(("value: " + v)));

        map.entrySet().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

    }
}
