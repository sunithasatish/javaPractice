package com.javapractice.variableTypes;

public class Hello {

	// variables - Static and Non Static 
	// methods - Static and Non Static 
	
	// Static methods and variables can be accessed directly both from Static and Non Static methods
	// Non Static Methods and Variables can be accessed using objects in Static methods
	// Non Static methods and Variables can be accessed directly in non static methods
	
		// constructor
		// blocks
	
	// Default constructor
	/*Hello(){
		System.out.print("Hi");
	}
*/	
	int k; //declaration defaults to 0;
	//k = 10; // assigning
	
	int i = 4; //Non static variable
	
	// public , private, protected and default
	public static void main(String[] args) {
		
		Hello objName; // Reference 
		//objName = new Hello();
		
		//int new = 1;
		
		Hello h1 = new Hello(); // 
		
		System.out.println(h1.i);
		h1.drive();
		
		System.out.println(j);
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		System.out.println("Count of :"+h1.count());
		start();

	}

	static int j= 5;
	
	// Static method
	static void start(){
		int k = 0;
		Hello h = new Hello();
		System.out.println(j);
		h.drive();
	}
	
	int count(){
		
		return 4;
		
	}
	//Non Static Method
	protected void drive(){
		System.out.println("Method to drive");
		System.out.print(j);
		
	}
	
	//blocks
	{
		System.out.print("Hi");
	}
	
}
