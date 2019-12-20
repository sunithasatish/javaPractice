package com.javapractice.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//0 -> "A", 1 -> "B" 
		//Maps ->  Karn -> Bglr, Tel - > Hyd (Key, Value) In - India, US - America, AU -> Australia
		
		Map<String, String> cap = new LinkedHashMap();
		
		cap.put("Karnataka", "Bangalore");
		cap.put("", "Unknown");
		cap.put("Telengana", "Hyd");
		cap.put("Telengana", "Hyderabad");
		cap.put("A", "Unknown");
		cap.put("Unknown", null);
		
		//System.out.println(cap.get("Karnataka"));
		
		for(Map.Entry<String,  String> entry : cap.entrySet()){
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
				

	}

}
