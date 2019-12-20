package com.javapractice.arrays;

public class Practice2DArray {
	
	public static void main(String[] args){
		
		int[][] a = new int[3][3];
		
		a[0][0] = 2;
		a[0][1] = 3;
		a[0][2] = 5;
		
		a[1][0] = 4;
		a[1][1] = 1;
		a[1][2] = 2;
		
		a[2][0] = 6;
		a[2][1] = 3;
		a[2][2] = 2;
		
		//System.out.println(a.length);

		for (int i=0; i< 3; i++){
			
			for(int j = 0; j< 3; j++){
				
				System.out.print(a[i][j]+"--");
			}
			
			System.out.println();
		}
		
		int b[][] = {{1,2,3}, {4,5,7}, {5, 7, 9}};
		
		
	}

}
