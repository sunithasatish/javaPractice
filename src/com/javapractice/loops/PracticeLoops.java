package com.javapractice.loops;

public class PracticeLoops {

	
	public static void main(String args[]){
		
		
		System.out.println(1); // int 1
		System.out.println(2); // ++1
		System.out.println(3); // until 10
		//int i =0;
		
		for (int i=0; i<=100; i++){
			System.out.println(i);
		}
		
		for (int i =10; i>=0; i--){
			System.out.println(i);
		}
		
		
		int j=11;
		while(j<=10){
			System.out.println("In while loop :"+j);
			j++;
		}
		
		int k =11;
		
		do{
			System.out.println("In do while loop:-"+k);
			k++;
		}while(k<=10);
		
		
		boolean t = true;
		while(t == true){
			System.out.println("Hi");
			t = false;
		}
		
		
		
		
	}
}
