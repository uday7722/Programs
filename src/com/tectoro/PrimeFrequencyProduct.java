package com.tectoro;


import java.util.HashMap;
import java.util.Map;

public class PrimeFrequencyProduct {
    public static void main(String[] args) {
        String s = "abaccdcdbbbd";
        System.out.println("Output: " + calculatePrimeFrequencyProduct(s));
    }

    // Method to calculate the product of prime frequencies
    private static int calculatePrimeFrequencyProduct(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character in the string
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        int product = 1;
        boolean foundPrime = false;

        // Loop through frequencies and multiply only prime frequencies
        for (int freq : frequencyMap.values()) {
            if (isPrime(freq)) {
                product *= freq;
                foundPrime = true;
            }
        }

        // If no prime frequency is found, return 0
        return foundPrime ? product : 0;
    }

    // Helper method to check if a number is prime
    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }
}

//Explanation:
//
//1. Count Character Frequencies: Use a HashMap to store the frequency of each character in the string.
//
//
//2. Check for Prime Frequencies: Iterate over the frequency map and check if each frequency is a prime number.
//
//
//3. Calculate Product: Multiply all prime frequencies together. If there are no prime frequencies, return 0.
//
//
//4. Prime Check: The isPrime function optimizes by eliminating non-prime numbers early.
//
//
//
//Example:
//
//For the input "abaccdcdbbbd", the frequency map is:
//
//a: 2, b: 4, c: 3, d: 4
//
//
//The prime frequencies are 2 and 3, so the product is . The output will be:
//
//Output: 6
