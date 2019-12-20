package com.javapractice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Integer> set1 = new TreeSet<>();
		
		set1.add(7);
		set1.add(4);
		set1.add(3);
		set1.add(3);
		set1.add(2);
		set1.add(2);
		set1.add(5);
		set1.add(8);
		
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(12);
		set2.add(13);
		set2.add(5);
		
		
		Set<Integer> set3 = new TreeSet<>(set1);
		
		// Union
		set3.addAll(set2);
		Iterator<Integer> itr = set3.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		set3.retainAll(set2);
		System.out.println("-----");
		Iterator<Integer> itr2 = set3.iterator();
		
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}

		
		// Remove a collection
		set3.removeAll(set2);
		System.out.println("-----");
		Iterator<Integer> itr1 = set3.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		

	}

}
