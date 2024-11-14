package com.tectoro;


import java.util.Scanner;

public class DiagonalDifferrence {
    public static int diagonalDifference(int[][] matrix, int n) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < n; i++) {
            primaryDiagonalSum += matrix[i][i];  // Sum of primary diagonal elements
            secondaryDiagonalSum += matrix[i][n - i - 1];  // Sum of secondary diagonal elements
        }

        // Calculate the absolute difference
        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the matrix
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Input the elements of the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate and print the absolute diagonal difference
        int result = diagonalDifference(matrix, n);
        System.out.println(result);
    }
}

//Explanation
//
//1. Input Handling:
//
//The program reads the size of the matrix n and then reads each element to fill the n x n matrix.
//
//
//
//2. Diagonal Sum Calculation:
//
//The primaryDiagonalSum is calculated by summing elements where the row index equals the column index (matrix[i][i]).
//
//The secondaryDiagonalSum is calculated by summing elements where the row index and column index add up to n - 1 (matrix[i][n - i - 1]).
//
//
//
//3. Absolute Difference:
//
//The absolute difference between the two diagonal sums is calculated using Math.abs(primaryDiagonalSum - secondaryDiagonalSum).
//
//
//
//4. Output:
//
//The result is printed as the output.
//
//
//
//
//Example
//
//For the input:
//
//3
//1 2 3
//4 5 6
//7 8 9
//
//1. Primary Diagonal Sum: 1 + 5 + 9 = 15
//
//
//2. Secondary Diagonal Sum: 3 + 5 + 7 = 15
//
//
//3. Absolute Difference: |15 - 15| = 0
//
//
//
//Output:
//
//0
