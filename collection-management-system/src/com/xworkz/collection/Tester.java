package com.xworkz.collection;

import java.util.Collection;
import java.util.ArrayList;

public class Tester {

	
	public static void main(String[] args) {
		Collection<Comparable> col = new ArrayList<Comparable>();
		col.add("Vikranth Rona");
		col.add("Rocketory");
		col.add(1);
		col.add(true);
		
		col.remove(1);
		col.forEach(System.out::println);
		
	}
}
