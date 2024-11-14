package com.tectoro;


import java.util.Scanner;

public class FrogJourney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of steps N: ");
        int N = scanner.nextInt();

        int step = 0;      // Tracks the current step number
        int jumpCount = 0; // Counts the total jumps made by the frog

        while (step < N) {
            jumpCount++;

            // Check if jumpCount is a perfect square
            int k = (int) Math.sqrt(jumpCount);
            if (k * k == jumpCount) {
                // If jumpCount is a perfect square, frog leaps by k steps
                step += k;
            } else {
                // Otherwise, frog jumps normally by 1 step
                step++;
            }
        }

        System.out.println("Jump Count: " + jumpCount);
        scanner.close();
    }
}

//Explanation:
//
//1. Input: We take N (the total number of steps in the well) as input.
//
//
//2. Loop: The loop runs until the frog reaches or exceeds the total number of steps.
//
//
//3. Perfect Square Check: For each jump, it checks if jumpCount is a perfect square by
