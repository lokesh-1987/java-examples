package com.java.examples;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = "Lokesh"; //would be created in String pool
        String s2 = s1; //would be created in String pool

        String s3 = new String(s1); //would be created in heap memory

        //if you want to put s3 in string pool from heap memory, then use intern method.

        if (s1 == s2) {
            System.out.println("s1 == s2 address is equal");
        }
        if (s1.equals(s2)) {
            System.out.println(" content is equal");
        }

        if (s3.equals(s1)) {
            System.out.println(" content is equal");
        }

        if (s1 == s3) {
            System.out.println("s1 == s2 address is equal");
        } else {
            System.out.println("s1 == s2 address is not equal");
        }

        if (s1 == s3.intern()) {
            System.out.println("s1 == s2 address is equal");
        } else {
            System.out.println("s1 == s2 address is not equal");
        }

        String s4 = s1.replace("Lo", "");
        System.out.println("s4 : " + s4 + " & s1 : " + s1);
    }
}
