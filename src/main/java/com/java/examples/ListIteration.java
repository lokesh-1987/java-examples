package com.java.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ListIteration {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 20).boxed().toList();
        System.out.printf("integerList : " + integerList + "\n");

        List<Integer> sortedIntegerList = integerList.stream().sorted(Integer::compareTo).toList();
        System.out.printf("sortedIntegerList : " + sortedIntegerList + "\n");

        Comparator<Integer> comparator = (v1, v2) -> v1.compareTo(v2);
        Comparator<Integer> comparator1 = Integer::compareTo;
        Comparator<Integer> comparator2 = Comparator.comparing(Integer::valueOf);

        Optional<Integer> maxInteger = integerList.stream().max(comparator);
        Optional<Integer> maxInteger1 = integerList.stream().max(comparator1);
        Optional<Integer> maxInteger2 = integerList.stream().max(comparator2);
        System.out.printf("maxInteger : " + maxInteger.get() + "\n");
        System.out.printf("maxInteger1 : " + maxInteger1.get() + "\n");
        System.out.printf("maxInteger2 : " + maxInteger2.get() + "\n");
    }
}
