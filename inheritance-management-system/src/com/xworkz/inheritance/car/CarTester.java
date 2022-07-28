package com.xworkz.inheritance.car;

public class CarTester {
	
	public static void main(String[] args) {
		
		Maruthi m = new Maruthi();
		m.type = 4 ;
		m.price = 1607000d;
		m.name = "maruthi";
		m.id = 766;
		m.colour = " pink ";
		
		System.out.println ( m.type + "    " + m.price + "      " + m.name + "     " + m.id + "   " + m.colour);
		

	
	Maruthi800 ma = new Maruthi800();
	ma.type = 4 ;
	ma.price = 1608000d;
	ma.name = "maruthi800";
	ma.id = 767;
	ma.colour = " black ";
	
	System.out.println ( ma.type + "    " + ma.price + "      " + ma.name + "     " + ma.id + "   " + ma.colour);
	
}
}
