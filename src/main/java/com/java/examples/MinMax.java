package com.java.examples;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MinMax {

    public static void main(String[] args) {
        String maxChar = Stream.of("6", "2", "1", "9", "8")
                .max(Comparator.comparing(String::valueOf))
                .get();

        System.out.printf("maxChar : " + maxChar + "\n");


        String minChar = Stream.of("6", "2", "1", "9", "8")
                .min(Comparator.comparing(String::valueOf))
                .get();

        System.out.printf("minChar : " + minChar + "\n");
        ;

        List<Employee> employees = EmployeeUtils.employees();

        Employee employeeMax = employees.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.printf("employeeMax : " + employeeMax + "\n");
        Employee employeeMin = employees.stream().min(Comparator.comparing(Employee::getAge)).get();
        System.out.printf("employeeMin : " + employeeMin + "\n");
    }
}
