package com.java.examples;

public class MergeSort {

    //The Time Complexity of Merge Sort is O(n log n) in both the average and worst cases.

    //The space complexity of Merge sort is O(n). This means that this algorithm takes
    // a lot of space and may slower down operations for the last data sets

    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 4, 6, 2};

        System.out.println("Before sorting : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for (int x = 0; x < n1; x++) {
            lArr[x] = arr[l + x];
        }

        for (int x = 0; x < n2; x++) {
            rArr[x] = arr[mid + 1 + x];
        }

        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }
}