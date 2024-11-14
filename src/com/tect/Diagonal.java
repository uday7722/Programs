package com.tect;

import java.util.Scanner;

public class Diagonal {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();

		int[][] matrix=new int[n][n];

		for(int i=0;i<n;i++) {

			for(int j=0;j<n;j++) {
				matrix[i][j]=scanner.nextInt();
			}

		}

		int result=diagonalDifference(matrix,n);
		System.out.println(result);

	}

	public static int diagonalDifference(int[][] matrix,int n) {

		int first=0;
		int second=0;

		for(int i=0;i<n;i++) {

			first+=matrix[i][i];
			second+=matrix[i][n-i-1];
		}

		return Math.abs(first-second);

	}




}
