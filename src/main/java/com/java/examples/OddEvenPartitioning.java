package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenPartitioning {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 6, 7, 3, 9);

        Map<Boolean, List<Integer>> oddEvenMap1 = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(oddEvenMap1);

        Map<String, List<Integer>> oddEvenMap = oddEvenMap1.entrySet().stream()
                .collect(Collectors.toMap(entry -> entry.getKey() ? "even" : "odd", Map.Entry::getValue));

        System.out.println(oddEvenMap);
    }

}
