package com.javapractice.strings;

import java.util.Scanner;

public class StringBufferPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";
		
		StringBuffer str1 = new StringBuffer(str);
		
		System.out.println(str1);
		
		str1.append(" World");
		
		System.out.println(str1);
		
		
		System.out.print(str1.reverse());
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the word to check ");
		String strPalindrome = sc.nextLine();
		
		//StringBuffer rev = new StringBuffer(strPalindrome); // Sysnchronous
		StringBuilder rev = new StringBuilder(strPalindrome);  // not Synchronus
		
		if(rev.equals(rev.reverse())){
			System.out.println("Word is a palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
		
	}

}
