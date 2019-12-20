package com.javapractice.inheritance;

public class Square extends Shape {
	
	void area(){ // Method Overriding
		int area = length * length;
		System.out.println("Area of square:- "+area);
	}
	
	int area(int l){ // Method overloading - Compile time polymorphism
		return l * l;
	}

	
}
