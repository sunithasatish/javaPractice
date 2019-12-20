package com.javapractice.abstractionPractice;

public class SBI implements Bank, RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI r = new SBI();
		r.accountCreate();
		
	}

	@Override
	public void accountCreate() {
		// TODO Auto-generated method stub
		System.out.println("Create Account for SBI");
	}

	@Override
	public void rateOfInterest() {
		// TODO Auto-generated method stub
		System.out.println("SBI Interest 7%");
	}

}
