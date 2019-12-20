package com.javapractice.abstractionPractice;

public class Square extends Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Square s = new Square();
		s.length = 4;
		System.out.println(s.area());

	}

	@Override
	double area() {
		
		
		
		// TODO Auto-generated method stub
		return length * length;
	}

	//byte(8) -> short(16) -> char(16) -> int(32)  -> float(32) -> long (64) -> double (64)
	
}
