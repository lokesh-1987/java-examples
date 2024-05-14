package com.java.examples;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private Integer id;
    private String empName;
    private Integer age;
}
