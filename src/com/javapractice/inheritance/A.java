package com.javapractice.inheritance;

public class A {
	
	static int i =0;
	
	 void method1(){
		System.out.println("Hi");
	}
	 
	 int sum(int a, int b){
		 
		 return a+b;
	 }

	 int sum(int a, int b, int c){
		 return a+b+c;
	 }
	 
	 float sum(float a, int b, int c){
		 return a+b+c;
	 }
	 
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new A();
		
		int sum = a.sum(3,5);
		System.out.println(sum);
		
		sum = a.sum(4, 5, 6);
		System.out.println(sum);

	}

}
