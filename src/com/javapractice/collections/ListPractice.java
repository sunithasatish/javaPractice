package com.javapractice.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList();
		
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(1, 4);
		
		list.remove(2);
		//list.add(6, 6);
		
		
		System.out.println(list);
		
		
		for(Integer i: list){
			System.out.println(i);
		}
		
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
	}

}
