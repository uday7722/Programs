package com.tect;

import java.util.Scanner;

public class Frog {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int step=0;
		int jump=0;
		
		while(step<n) {
			jump++;
			
			int k=(int) Math.sqrt(jump);
			if(k*k==jump) {
				step+=k;
				
			}
			else {
				step++;
			}
			
		}
		
		System.out.println(jump);
	}

}
