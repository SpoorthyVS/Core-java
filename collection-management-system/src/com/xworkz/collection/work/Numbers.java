package com.xworkz.collection.work;

import java.util.ArrayList;
import java.util.Collection;

public class Numbers {
	public static void main(String[] args) {
		Collection<Integer> ca = new ArrayList<Integer>();
		ca.add(1);
		ca.add(2);
		ca.add(3);
		ca.add(4);
		ca.add(5);
		ca.add(6);
		ca.add(7);
		ca.add(8);
		ca.add(9);
		ca.add(10);
		
		ca.remove(7);
		ca.forEach(System.out::println);
	}
}
