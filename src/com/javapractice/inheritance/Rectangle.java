package com.javapractice.inheritance;

public class Rectangle extends Shape {
	
	void area(){ // Method overriding 
		int area = length * breadth;
		System.out.println(area);
		
	}

}
