package com.javapractice.collections;

import java.util.HashSet;
import java.util.Set;

public class SetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> wind = new HashSet();
		
		wind.add("A");
		wind.add("B");
		
		String[] strArr = new String[wind.size()]; //
		int[] j = new int[3];
		j[0] = 1;
		
		int[] k = {1,2,3};
		
		int[] l = new int[]{1,2,4};
		
		
		wind.toArray(strArr);
		
		for(int i=0; i <strArr.length; i++){
			System.out.println(strArr[i]);
		}
		
	}

}
