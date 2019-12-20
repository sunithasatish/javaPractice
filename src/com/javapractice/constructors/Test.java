package com.javapractice.constructors;


class A{
	
	A(){
		System.out.println("IN constructor");
	}
	
	A(int i){
		System.out.println("Constructor overloading: " +i);
	}
	
	public String toString(){
		
		return "Hellow";
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//A a = new A();
		A a1 = new A(1);
		//System.out.println(a);

	}

}
