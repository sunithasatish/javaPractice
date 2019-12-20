package com.javapractice.arrays;

public class AverageProblem {

	static int to;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] i = {4, 5, 8, 10};
		
		double total = 0;
		
		
		for(double j: i){
			
			total = total + j;
			
		}
		
		double avg = total/i.length;
		
		System.out.println("Average of array : "+avg);
		
	}

}
