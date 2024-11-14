package com.tect;

import java.util.Scanner;

public class Multiply {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		
		int product=multiply(m,n);
		
		System.out.println(product);
		
	}
	
	public static int multiply(int m,int n) {
		
		if(m==0||n==0)
		{
			return 0;
		}
		
		int product=multiply(m, n-1);
		
		return m+product;
	}	

}
