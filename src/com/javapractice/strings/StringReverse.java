package com.javapractice.strings;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringReverse strReverse = new StringReverse();
		String str1 = strReverse.stringReverse("Hello World");
		String str2 = strReverse.stringReverse("Java Practice");
		
		System.out.println(str1);
		System.out.println(str2);
		
		
		// Palindrome = TATAT
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the word :");
		String w1 = sc.nextLine();
		
		//System.out.println(w1.equals(strReverse.stringReverse(w1)));
		
		System.out.println("Word is :"+w1);
		
		if(w1.equals(strReverse.stringReverse(w1))){
			System.out.println("Given word is a palindrome");
		}else
		{
			System.out.println("Word is not a palindrome");
		}
		

	}
	
	
	String stringReverse(String str){
		
		//String s1 = "Hello World";
		
		char[] a = str.toCharArray(); // {'H','e','l'}
		
		char[] b = new char[str.length()];
		int index = 0;
		for(int i=a.length-1; i>=0; i--){
			//System.out.print(a[i]);
			b[index] = a[i];
			index++;
			
		}
		//System.out.println();
		
		String revString = new String(b);
		
		return revString;
		
	}

}
