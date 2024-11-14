package com.tectoro;


import java.util.Arrays;
import java.util.Scanner;

public class SillySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Input the elements of the array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the size is even or odd
        int midIndex = size / 2;

        // Sort the first half of the array
        int[] firstHalf = Arrays.copyOfRange(array, 0, midIndex);
        Arrays.sort(firstHalf);

        // Sort the second half of the array
        int[] secondHalf;
        if (size % 2 == 0) {
            secondHalf = Arrays.copyOfRange(array, midIndex, size);
        } else {
            secondHalf = Arrays.copyOfRange(array, midIndex + 1, size);
        }
        Arrays.sort(secondHalf);

        // Build the result array
        int[] result = new int[size];
        System.arraycopy(firstHalf, 0, result, 0, firstHalf.length);

        if (size % 2 == 1) {
            result[midIndex] = array[midIndex];
        }

        System.arraycopy(secondHalf, 0, result, midIndex + (size % 2 == 1 ? 1 : 0), secondHalf.length);

        // Output the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

//Explanation
//
//1. Input Handling: The program reads the size of the array and its elements from the user.
//
//
//2. Splitting and Sorting:
//
//If the array size is even, it divides the array into two equal halves.
//
//If the array size is odd, it leaves the middle element in its original position.
//
//
//
//3. Combining the Sorted Halves: After sorting each half separately, it constructs the final "silly sorted" array by combining the two sorted halves (and middle element if applicable).
//
//
//4. Output: The program outputs the "silly sorted" version of the array.
//
//
//
//Example
//
//For an input like:
//
//10
//3 -8 6 10 -8 7 -10 10 -3
//
//The output would be:
//
//-8 -8 3
