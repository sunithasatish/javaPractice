package com.javapractice.abstractionPractice;

public interface Bank {
	
	// By default all methods are abstract, static and final
	int minDeposit = 1000;
	void rateOfInterest();

	default void withdraw(){
		System.out.println("Withdraw");
	}
	
	static void deposit(){
		
	}
	 
	 
}
