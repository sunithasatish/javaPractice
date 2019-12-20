package com.javapractice.strings;

public class StringPractice {

	
	public static void main(String []args){
		
		int a = 3; // Stack
		
		String s1= "Hello"; // Immutable; // Heap memory - string memory pool 
		
		char[] a1 = s1.toCharArray();
		
		for(char i: a1){
			System.out.println(i);
		}
		
		
		
		String s11 = "Hello";
		
		String s12 = "HELLO";
		
		s12 = "HELLOWORLD";
		
		System.out.println(s1.equals(s11));
		
		System.out.println(s1 == s11);
		
		System.out.println(s1.equals(s12));
		
		System.out.println(s1.equalsIgnoreCase(s12));
		
		System.out.println(s1);
		
		String s2 = new String("Hellow World");
		System.out.println(s2);
		
		
		char[] s3= {'a','b','c'};
		String s4 = new String(s3);
		
		System.out.println(s4);
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.concat(" World"));
		
		
	
		System.out.println(s1 + s2);
		
		System.out.print(s1.contains("He"));
		
		
		
		
		
		
		
		
		
	}
}
