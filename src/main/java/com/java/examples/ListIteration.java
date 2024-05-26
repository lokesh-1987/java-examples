package com.java.examples;

import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ListIteration {
    public static void main(String[] args) {

        List<Integer> integerList = IntStream.rangeClosed(1, 20).boxed().toList();
        System.out.printf("integerList : " + integerList + "\n");

        List<Integer> sortedIntegerList = integerList.stream().sorted(Integer::compareTo).toList();
        System.out.printf("sortedIntegerList : " + sortedIntegerList + "\n");

        Optional<Integer> maxInteger = integerList.stream().max(Integer::compareTo);
        System.out.printf("maxInteger : " + maxInteger.get() + "\n");
    }
}
