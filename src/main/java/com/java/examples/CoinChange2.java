package com.java.examples;


//SELECT
//e.location,
//COUNT(*) AS Count
//FROM
//Employee e
//JOIN
//Employee m ON e.managerId = m.id
//        WHERE
//e.salary > m.salary
//GROUP BY
//e.location

public class CoinChange2 {

    //https://www.youtube.com/watch?v=UZ5QK-UV8MI&t=93s
    public static void main(String[] args) {
        int amount = 11;
        int[] coins = new int[]{1, 2, 5};

        int waysToFormAmount = coinChange2(amount, coins, 0);
        System.out.printf("waysToFormAmount : " + waysToFormAmount);
    }

    private static int coinChange2(int amount, int[] coins, int index) {
        if (amount == 0) {
            return 1;
        }

        if (amount < 0 || index == coins.length) {
            return 0;
        }

        int result = 0;

        for (int i = index; i < coins.length; i++) {
            if (amount >= coins[i]) {
                result += coinChange2(amount - coins[i], coins, i);
            }
        }
        return result;
    }
}
