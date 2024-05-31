package com.java.examples;

import java.util.List;

public interface EmployeeUtils {

    static List<Employee> employees() {
        return List.of(Employee.builder()
                .id(1)
                .empName("Lokesh")
                .salary(4200)
                .age(24)
                .build(), Employee.builder().id(2)
                .empName("Jack")
                .age(25).salary(56000).build());
    }

    static List<Employee> duplicateEmployees() {
        return List.of(Employee.builder()
                        .id(1)
                        .empName("Lokesh")
                        .salary(4200)
                        .age(24)
                        .build(), Employee.builder().id(2)
                        .empName("Jack")
                        .age(25).salary(56000).build(),
                Employee.builder().id(3)
                        .empName("Jack")
                        .age(25).salary(65000).build());
    }

    static Employee employee1() {
        return Employee.builder()
                .id(1)
                .empName("Jack")
                .salary(4200)
                .age(24)
                .build();
    }

    static Employee employee2() {
        return Employee.builder().id(2)
                .empName("Lokesh")
                .salary(56000)
                .age(25).build();
    }

}
