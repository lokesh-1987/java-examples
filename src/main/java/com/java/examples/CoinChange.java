package com.java.examples;

public class CoinChange {

    public static void main(String[] args) {
        int amount = 11;
        int[] coinDenominations = new int[]{1, 2, 5};
        System.out.printf("amount : " + amount + "\n");
        int waysToFormAmount = coinChange(amount, coinDenominations);
        System.out.printf("waysToFormAmount : " + waysToFormAmount);
    }

    private static int coinChange(int amount, int[] coins) {

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
