package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AverageTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] countries = {"India", "US", "Australia"};
		Double[] indTemp = {31.0, 34.0, 36.0, 42.0};
		Double[] usTemp = {31.0, 24.0, 26.0};
		Double[] auTemp = {21.0, 24.0, 16.0};
		
		
		
		List<String> li = Arrays.asList(countries);
        Iterator<String> itr = li.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		
		double total = 0;
		
		for(double j: indTemp){
		  total = total + j;
		}
		double indTempavg = total/indTemp.length;
		System.out.println(indTempavg);
		
		// InTemp Avg = 34.0
		List<Double> temp1 = Arrays.asList(indTemp);
		List<Double> temp2 = Arrays.asList(usTemp);
		List<Double> temp3 = Arrays.asList(auTemp);
		
		Map<String, List<Double>> map = new HashMap<>();
		map.put(countries[0], temp1);
		map.put(countries[1], temp2);
		map.put(countries[2], temp3);
		double totalTemp = 0;
		for(Map.Entry<String, List<Double>> map1: map.entrySet()){
			
			String country = map1.getKey();
			List<Double> tem = map1.getValue();
			
			for(double j: tem){
				totalTemp = totalTemp+j;
			}
		//	totalTemp = 0;
			System.out.println(country + " Average Temp "+totalTemp/tem.size() + "Total Temp "+totalTemp);
			totalTemp =0;
		}
		
		
		
		
				
	}
	
}
