package com.javapractice.collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args){
		
		String str = "HelloO World Zone";
		// l - 3, o -> 2 {'h' , 'e', 'l'..}
		
		System.out.println(str.replaceAll("\\s",""));
		char[] ch = str.toLowerCase().replaceAll("\\s", "").toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		//H -> 0
		int count = 1;
		for(char c: ch){
			
			if(map.containsKey(c)){
				map.put(c, count++);
			}else{
				map.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry: map.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey() +":" + entry.getValue());
			}
			
		}
		
		
	}
}
