package com.java.examples;

import java.util.concurrent.*;

public class ThreadUsingRunnableCallable {
    public static void main(String[] args) {

        Runnable runnableTask = () -> {
            try {
                System.out.println("runnableTask");
            } catch (Exception e) {

            }
        };

        Callable<String> callableTask = () -> {
            try {
                System.out.println("callableTask");
            } catch (Exception e) {

            }
            return "callableTask";
        };

        Thread threadTask = new Thread(runnableTask);
        threadTask.start();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        executorService.submit(runnableTask);

        Future<String> futureCallableTask = executorService.submit(callableTask);

        try {
            System.out.println("futureCallableTask : " + futureCallableTask.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
