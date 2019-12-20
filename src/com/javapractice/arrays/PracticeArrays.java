package com.javapractice.arrays;

public class PracticeArrays {
	
	
	public static void main(String[] args){
		
		int[] b = new int[5];
		
		b[0] = 4;
		b[1] = 3;
		b[4] = 5;
		
		System.out.println(b[4]);
		
		//System.out.println(b.)
		
		
		
		int a[] = new int[5];
		
		
		int x = 1;
		x = 2;
		
		
		
		int c[] = {3, 4, 6, 1, 4};
		c[0] = 2;
		
		System.out.println("Size od array: "+(c.length));
		
		/*System.out.println(c[0]);
		System.out.println(c[1]);
		
		
		for (int i = 0; i<= c.length-1; i++){
			System.out.println(c[i]);
		}*/
		
		for (int d: c){
			System.out.println(d);
		}
		
		char[] e = {'h','e','l','l', 'o'};
		
		for (int i = 0; i<= e.length-1; i++){
			System.out.print(e[i]);
		}
		
		System.out.println();
		
		for (char d: e){
			
			System.out.print(d);
		}
		
		
	}
}
