package com.tectoro;

import java.util.*;

public class Frequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string:");
        String inputString = scanner.nextLine();

        int product = calculatePrimeFrequencyProduct(inputString);
        System.out.println("Product of prime frequencies: " + product);
    }

    private static int calculatePrimeFrequencyProduct(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate frequency of each character
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        int product = 1;

        // Calculate product of prime frequencies
        for (int freq : frequencyMap.values()) {
            if (isPrime(freq)) {
                product *= freq;
            }
        }

        return product;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
