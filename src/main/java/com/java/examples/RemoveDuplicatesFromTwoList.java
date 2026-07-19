package com.java.examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromTwoList {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4, 2, 4, 2, 2, 3, 7, 6);

        List<Integer> list2 = Arrays.asList(4, 2, 4, 2, 8, 3, 7, 7, 9);


        List<Integer> distinctList = Stream.concat(list1.stream(), list2.stream())
                .distinct()
                .toList();
        System.out.println(distinctList);

        Set<Integer> distinctList1 = Stream.concat(list1.stream(), list2.stream())
                        .collect(Collectors.toSet());
        System.out.println(distinctList1);

    }
}
