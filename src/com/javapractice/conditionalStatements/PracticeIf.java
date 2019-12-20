package com.javapractice.conditionalStatements;

/**
 * @author Admin
 * 
 *
 */
public class PracticeIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 5;
		int j = 5;
		System.out.println(i <= j);

		// If Else
		if (i < j) {
			System.out.print("I is less than J");
		} else {
			System.out.println("I is greater than j");
		}

		//  Else If
		if (i < j) {
			System.out.print("I is less than J");
		} else if (i > j) {
			System.out.println("I is greater than j");
		} else {
			System.out.println("I and J are equal");
		}

		// Days of week: 1, 2, 3, 4, 5, 6, 7
		// Marks Range - 0-40% - Fail, 40-50% - C Grade 50-60,% - B Grade ,
		// 60-70- A, 70- 100 - A+
		// True && TRue = True
		// TRue && False = False
		// FAlse && TRue = False
		// False && False = False

		// True || True = True
		// True || False = True
		// False || True = TRue
		// Fallse || False = False

		int marks = 40;

		if (marks <= 40 && marks >= 0) {
			System.out.println("FAil");
		} else if (marks > 40 && marks <= 50) {
			System.out.println("C");
		} else if (marks > 50 && marks <= 60) {
			System.out.println("B");
		} else if (marks > 60 && marks <= 100) {
			System.out.println("A");
		} else {
			System.out.println("Not valid marks");
		}

		
		switch (marks) {

		case (40): {
			System.out.println("Switch FAil");
			break;
		}
		case (50): {
			System.out.println("B");
			break;
		}
		case (60): {
			System.out.println("A");
			break;
		}
		default: {
			System.out.println("Not valid Marks");
			break;
		}
		}

		char alphabet = 'e';
		
		if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i'){
			System.out.println("Given alphabet is an owel");
		}else{
			System.out.println("Given alphabet is a constant");
		}
		
		switch(alphabet){
		
		case ('a'):{
			System.out.println("IS an owel");
			break;
		}
		default: {
			System.out.println("Given alphabet is a constant");
			break;
		}
		}
		
	}

}
