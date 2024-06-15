package com.java.examples;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeSalaryCalculation {

    public static void main(String[] args) {

        Map<String, Optional<Employee>> empResult = EmployeeUtils.duplicateEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getEmpName, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.printf("empResult : " + empResult + "\n");

        Map<String, Long> empMap1 = EmployeeUtils.duplicateEmployees().stream()
                .collect(Collectors.groupingBy(Employee::getEmpName, Collectors.counting()));

        System.out.printf("empMap1 : " + empMap1 + "\n");

        Stream<Employee> mapMaxSalByDept1Nth = EmployeeUtils.duplicateEmployees().stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .limit(3)
                .skip(2);
        mapMaxSalByDept1Nth.forEach(emp -> {
            System.out.println("emp with 3rd highest salary: " + emp + "\n");
        });


       Optional<Employee> employee =
               EmployeeUtils.duplicateEmployees().stream().max(Comparator.comparingDouble(Employee::getSalary));

    }
}
