package com.javapractice.inheritance;

public class AreaTest {

	public static void main(String args[]){
		
		Shape s = new Rectangle();
		s.length = 3;
		s.breadth = 4;
		s.area();
		
		Shape s1 = new Square();
		s1.length = 3;
		s1.area(); //
		
		//s1.area(3); // com
		
		Square s2 = new Square();
		s2.length = 3;
		System.out.println(s2.area(s2.length));
		
		Square s3 = (Square) new Shape();
		
		Rectangle r = new Rectangle();
		r.breadth = 3;
		r.length = 2;
		r.area();
		
		
	}
}
