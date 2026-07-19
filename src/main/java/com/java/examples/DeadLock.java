package com.java.examples;

public class DeadLock {

    public static void main(String[] args) {


        Runnable runnableTask1 = () -> {
            synchronized (String.class) {
                try {
                    Thread.sleep(1000);
                    synchronized (Object.class) {
                        System.out.println("String & Object classes are locked");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable runnableTask2 = () -> {
            synchronized (Object.class) {
                try {
                    Thread.sleep(1000);
                    synchronized (String.class) {
                        System.out.println("Object & String classes are locked");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(runnableTask1);
        t1.start();
        Thread t2 = new Thread(runnableTask2);
        t2.start();
    }
}
