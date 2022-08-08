package com.xworkz.collection.work;

import java.util.ArrayList;
import java.util.Collection;

public class Alphabet {
	
	public static void main(String[] args) {
		Collection<Character> cha = new ArrayList<Character>();
		cha.add('A');
		cha.add('B');
		cha.add('C');
		cha.add('D');
		cha.add('E');
		cha.add('F');
		cha.add('G');
		cha.add('H');
		cha.add('I');
		cha.add('J');
		
		cha.remove('I');
		cha.forEach(System.out::println);
	}
}
