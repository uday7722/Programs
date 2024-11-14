package com.tectoro;
import java.util.Scanner;

public class Multiplication {

    // Recursive function to multiply M and N
    public static int multiply(int M, int N) {
        // Base case: when N is 0, the product is 0
        if (N == 0) {
            return 0;
        }
        // Recursive case: M * N = M + (M * (N - 1))
        return M + multiply(M, N-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for M and N
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Calling the recursive multiply function and printing the result
        System.out.println(multiply(M, N));
    }
}

//Explanation:
//
//1. multiply(int M, int N):
//
//This function recursively calculates the product of  and  by adding  repeatedly.
//
//Base case: If , it returns 0 (since multiplying by 0 gives 0).
//
//Recursive case: Otherwise, it returns .
//
//
//
//2. Main Function:
//
//It reads the input values for  and .
//
//Then, it calls the multiply() function to compute the product and prints the result.
//
//
//
//
//Input/Output Example:
//
//Input:
//
//4
//5
//
//Output:
//
//20
//
//This function will correctly compute the product of the two numbers using recursion.package com.tectoro;
//
//public class D {
//
//}
