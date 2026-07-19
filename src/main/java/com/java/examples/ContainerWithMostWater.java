package com.java.examples;

//https://www.youtube.com/shorts/lnoSzfVhvk4
public class ContainerWithMostWater {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 6, 2, 5, 4, 8, 2, 7};

        System.out.println(containerWithMostWater(arr));
    }

    private static int containerWithMostWater(int[] arr) {

        int maxArea = 0;

        int i = 0, j = arr.length - 1;

        while (i < j) {
            int currentHeight = Math.min(arr[i], arr[j]);
            int currentArea = currentHeight * (j-i);
            maxArea = Math.max(maxArea, currentArea);

            if (arr[i] > arr[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
