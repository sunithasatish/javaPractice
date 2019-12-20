package com.javapractice.exceptions;

import java.io.File;

public class ExceptionsPractice {

	// checked exception and unchecked exceptions

	// Checked Exception - IO Exceptions, SQL Exceptions
	// Unchecked Exceptions- Runtime exceptions - Arithmetic, ArrayIndex out of Null Pointer
	// bound, Stackoverflow

	// throws cuase
	// try, catch, finally block
	// throw keyword
	public static void main(String[] args) {

		// File f = new File("");
		// f.canRead();
		
		//Property p = new Property();
		
		try {

			Thread.sleep(100); // checked
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * try { System.out.println(i/j); } catch (Exception e){
		 * System.out.println("In catch block"); e.printStackTrace(); }
		 */
		ExceptionsPractice ep = new ExceptionsPractice();
		
		
		try {
			ep.excMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Exception");

	}

	 void excMethod() throws Exception{
		int i = 10;

		int j = 0;

		int a[] = new int[3];

		a[3] = 4;
		
		try {

			String str = null;

			System.out.println(str.length());

			System.out.println(i / j);
			a[3] = 4;

			System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound exception");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception");
		} catch (NullPointerException e) {
			System.out.println("Nullpointer  exception");
		} catch (Exception e) {
			System.out.println("MAin Exception class");
			e.printStackTrace();
		} finally {
			System.out.println("In finally block");
		}

		System.out.println("Exception final");

	}
}
