package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0] = 2;
			Integer[] arr1 = {4, 2, 5}; // Fixed in size
			
			System.out.println(arr1);
			
			List<Integer> li = new ArrayList(); // Dynamic in size
			
			//li.add(arr1[0]);
			//li.add(arr1[1]);
			
			for(int i: arr1){
				li.add(i);
			}
			
			System.out.println(li);
			Collections.sort(li);
			System.out.println(Collections.min(li));
			
			List<Integer> li2 = Arrays.asList(arr1);
			
			
			System.out.println(li2);
			
			
			String[] arr2 = {"Hi", "There"};
			List<String> li1 = Arrays.asList(arr2);
			
			System.out.println(li1);
			
			
			
			
		
	}

}
