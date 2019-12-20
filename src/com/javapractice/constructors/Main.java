package com.javapractice.constructors;

class Parent{
	
	int i = 5;
	Parent(){
		System.out.println("In default constructor");
	}
	
	Parent(int i){
		//int i=0;
		this.i = i;
		System.out.println("In overload constructor");
	}
	
	public void print(){
		System.out.println("Hello");
		
	}
}

class Child extends Parent{
	int i = 10;
	Child(){
		//super(5);
		
		System.out.println("In child default constructor value of i : "+this.i);
		System.out.println("In child default constructor value of i : "+super.i);
		System.out.println("In child default constructor");
		print();
	}
	
	Child(int i){
		
		this();
	}
	//
	public void print(){
		
		
		super.print();
		System.out.println("Hello child class");
		
	}
	
	public void run(){
		super.i = 5;
		this.print();
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Child();
		new Child(5);
		

	}

}
