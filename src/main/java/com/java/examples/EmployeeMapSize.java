package com.java.examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class EmployeeMapSize {

    public static void main(String[] args) {
        Employee e1 = Employee.builder().id(1).empName("Lokesh").salary(100).build();
        Employee e2 = Employee.builder().id(1).empName("Lokesh").salary(100).build();

        if (e1.equals(e2)) {
            System.out.println("e1 and e2 are equal.");
        } else {
            System.out.println("e1 and e2 are not equal.");
        }

        Map<Employee, Integer> employeeIntegerMap = new HashMap<>();

        employeeIntegerMap.put(e1, 1);
        employeeIntegerMap.put(e2, 2);

        System.out.println("employeeIntegerMap size : " + employeeIntegerMap.size());

        HashSet<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);

        System.out.println("employees size : " + employees.size());
    }
}
