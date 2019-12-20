package com.javapractice.arrays;

public class Factorial {
	
	public static void main(String args[]){
		
		int fact = 4;
		//int total;
		for(int i=3; i>0 ; i--){
			// 4 * 3 * 2 * 1
			fact = fact * i; // 12, 24, 24
			//System.out.println(fact);
			
		}
		System.out.println(fact);
	}

}
