package com.javapractice.abstractionPractice;

public class HDFC implements Bank {

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		
		System.out.println(" Rate of intereset 8%");
		
	}
	
	
	public static void main(String[] args){
		Bank b = new HDFC();
		b.rateOfInterest();
		
		
		System.out.println(minDeposit);
		
	}
	

}
