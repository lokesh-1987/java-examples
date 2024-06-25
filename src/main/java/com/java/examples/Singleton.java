package com.java.examples;

public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    //Lazy Singleton
    public static Singleton getInstance1() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    //Double Check locking
    private static volatile Singleton instance2 = null;

    public static Singleton getInstance2() {
        if (instance2 == null) {
            synchronized (Singleton.class) {
                if (instance2 == null) {
                    instance2 = new Singleton();
                }
            }
        }
        return instance2;
    }
}
