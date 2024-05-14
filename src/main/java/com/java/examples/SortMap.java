package com.java.examples;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {

    public static void main(String[] args) {

        Map<String, Integer> unsortMap = new HashMap<>();
        unsortMap.put("z", 10);
        unsortMap.put("b", 5);
        unsortMap.put("a", 6);
        unsortMap.put("c", 20);
        unsortMap.put("d", 1);
        unsortMap.put("e", 7);
        unsortMap.put("y", 8);
        unsortMap.put("n", 99);
        unsortMap.put("g", 50);
        unsortMap.put("m", 2);
        unsortMap.put("f", 9);

        System.out.println("Original...");
        System.out.println(unsortMap);

        Map<String, Integer> result = unsortMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(result);


        Map<String, Integer> result1 = unsortMap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        System.out.println("Sorted...reversed...");
        System.out.println(result1);




        Employee e1 = Employee.builder()
                .id(1)
                .empName("Jack")
                .age(24)
                .build();

        Employee e2 = Employee.builder().id(2)
                .empName("Lokesh")
                .age(25).build();

        Map<String, Employee> employeeMap = Map.of(e1.getEmpName(), e1, e2.getEmpName(), e2);
        System.out.println("Original...");
        System.out.println(employeeMap);

        Map<String, Employee> sortedEmployeeMap = employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(sortedEmployeeMap);


        Map<String, Employee> sortedEmployeeReversedMap = employeeMap.entrySet().stream()
                .sorted(Map.Entry.<String, Employee>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));

        System.out.println("Sorted...reversed...");
        System.out.println(sortedEmployeeReversedMap);

        Map<String, Employee> sortedEmployeeMapByValueId = employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.comparing(Employee::getId)))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));

        System.out.println("Sorted...");
        System.out.println(sortedEmployeeMapByValueId);

        Map<String, Employee> sortedEmployeeMapByValueName = employeeMap.entrySet().stream()
                .sorted(Map.Entry.<String, Employee>comparingByValue(Comparator.comparing(Employee::getEmpName)).reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));

        System.out.println("Sorted...reversed...");
        System.out.println(sortedEmployeeMapByValueName);
    }
}
