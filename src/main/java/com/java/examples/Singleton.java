package com.java.examples;

// race around condition in Multithreaded env, serialization and cloning all break Singleton pattern in Java
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {

        if (instance != null) {
            //throw runtime exception
        }
    }

    //serialization handling -remedy
    protected Object readResolve() {
        return getInstance2();
    }


    //clone handling
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton instance can't supported");
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
