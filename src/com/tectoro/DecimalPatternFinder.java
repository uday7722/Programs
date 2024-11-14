package com.tectoro;

import java.util.Scanner;

public class DecimalPatternFinder {

    public static void findPatternInDecimal(int m, int n, String pattern) {
        // Convert m/n to decimal with high precision
        String decimalExpansion = String.format("%.1000f", (double) m / n);
        String decimalPart = decimalExpansion.split("\\.")[1]; // Extract only the decimal part

        // Find the first occurrence of the pattern
        int index = decimalPart.indexOf(pattern);

        if (index == -1) {
            System.out.println("doesn't exist");
        } else {
            // Determine the digit before and after the pattern
            String before = index > 0 ? String.valueOf(decimalPart.charAt(index - 1)) : "None";
            String after = index + pattern.length() < decimalPart.length()
                    ? String.valueOf(decimalPart.charAt(index + pattern.length()))
                    : "None";
            
            // Output the result
            System.out.println(before + pattern + after);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        
        System.out.print("Enter the pattern to search for: ");
        String pattern = scanner.next();
        
        findPatternInDecimal(m, n, pattern);
        
        scanner.close();
    }
}
