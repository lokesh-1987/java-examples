package com.java.examples;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerProblem {

    private static final BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(100);

    //blockingQueue is thread safe, causes NullPointerException if try to add null element

    public static void main(String[] args) {

        Runnable runnableProducerTask = () -> {
            try {
                producer();
                System.out.println("runnableProducerTask");
            } catch (InterruptedException ignored) {

            }
        };

        Runnable runnableConsumerTask = () -> {
            try {
                Thread.sleep(1000);
                consumer();
                System.out.println("runnableConsumerTask");
            } catch (InterruptedException ignored) {

            }
        };
        Thread producerTask = new Thread(runnableProducerTask);
        producerTask.start();
        Thread consumerTask = new Thread(runnableConsumerTask);
        consumerTask.start();
    }

    private static void producer() throws InterruptedException {
        while (true) {
            int produced = new Random().nextInt(100);
            blockingQueue.put(produced);
            System.out.println("Produced : "+produced);
        }
    }

    private static void consumer() throws InterruptedException {
        while (true) {
            Integer consumed = blockingQueue.take();
            System.out.println("Consumed : "+consumed);
        }
    }
}
