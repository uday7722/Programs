package com.tectoro;

public class Silly {

    public static void sillySort(int[] arr, int i, int j) {
        if (i >= j) {
            return;
        }

        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int k = (j - i + 1) / 3;
        sillySort(arr, i, j - k);
        sillySort(arr, i + k, j);
        sillySort(arr, i, j - k);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        sillySort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
