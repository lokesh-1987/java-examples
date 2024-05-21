package com.java.examples;

public class StairCase {

    public static void main(String[] args) {
        //https://www.youtube.com/watch?v=YHGRqNdrk9A
        System.out.printf("ways to climb on top steps : " + climbStairs(4));
    }

    public static int climbStairs(int n) {
        int[] steps = new int[n + 1];

        steps[0] = 1;
        steps[1] = 1;

        for (int i = 2; i <= n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n];
    }
}
