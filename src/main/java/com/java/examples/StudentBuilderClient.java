package com.java.examples;

public class StudentBuilderClient {

    public static void main(String[] args) {
        Student b = new Student.Builder().id(1).name("Lokesh").marks(100).build();
        System.out.printf("student :" + b.getName());
    }
}
