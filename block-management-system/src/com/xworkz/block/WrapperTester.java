package com.xworkz.block;

public class WrapperTester {
	
	public static void main(String[] args) {
//		converted wrapper class to primitive
		Integer baba = 78;
		 //		auto-boxing
		Long baba2 = 78L;
		Byte baba3 = 78;
		Short baba4 = 78;
		Float baba5 = 78f;
		Double baba6 = 78d;
		
		
		System.out.println(baba == baba2.intValue());
		System.out.println(baba == baba3.intValue());
		System.out.println(baba == baba4.intValue());
		System.out.println(baba == baba5.intValue());
		System.out.println(baba == baba6.intValue());
		
//		comparing primitive type to wrapper class
		int babi = 78;
		long babi2 = 78l;
		byte babi3 = 78;
		short babi4 = 78;
		float babi5 = 78f;
		double babi6 = 78d;
		
		
		System.out.println(babi == baba);
		System.out.println(babi2 == baba2);
		System.out.println(babi3 == baba3);
		System.out.println(babi4 == baba4);
		System.out.println(babi5 == baba5);
		System.out.println(babi6 == baba6);

	}
	
}
