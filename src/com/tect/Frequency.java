package com.tect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		System.out.println(calculateFrequency(str));
		
	}
	
	public static int calculateFrequency(String str) {
		
		
		Map<Character ,Integer> map=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		int product=1;
		
		for(int freq:map.values()) {
			if(isPrime(freq)) {
				product*=freq;
			}
		}
		return product;
	}

	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}
	
}
