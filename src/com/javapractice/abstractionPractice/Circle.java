package com.javapractice.abstractionPractice;

public class Circle extends Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes c = new Circle();
		c.radius = 2;
	    System.out.println("Area of circle-:" +c.area());
	 
	}

	@Override
	double area() {
		double pi = 3.14;
		double area = pi * radius * radius;
		// TODO Auto-generated method stub
		return area;
	}

}
