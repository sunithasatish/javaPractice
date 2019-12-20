package com.javapractice.inheritance;

public class B extends A {

	void met(){
		this.method1();
	}
	
	void method1(){ // Method overriding - IS -A
		super.method1();
		System.out.println("B");
	}
	
	void method1(int i, int j){ // method overlaoding
		
		System.out.print(i);
		System.out.println(j);
	}
	
	int sum(int a, int b){
		
		return a+b;
	}
	
	void method1(int i, float j){ // method overlaoding
		
		System.out.print(i);
		System.out.println(j);
	}
	
	int method1(int i, double j){ // method overlaoding
		
		System.out.print(i);
		System.out.println(j);
		return i;
	}

	void method1(int i, int j, int k){ // method overlaoding
		
		System.out.print(i);
		System.out.println(j);
	}
	
	void method1(char a, char b){
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		
		b.met();
		
		b.method1(5, 6);
		
		b.method1('a', 'b');

	}

}
