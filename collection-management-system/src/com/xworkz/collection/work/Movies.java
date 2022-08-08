package com.xworkz.collection.work;

import java.util.ArrayList;
import java.util.Collection;

public class Movies {
	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<String>();
		c.add("Vikranth Rona");
		c.add("Love Mocktail2");
		c.add("777 Charlie");
		c.add("Robert");
		c.add("James");
		c.add("Yuvarathna");
		c.add("Bhajarangi 2");
		c.add("Kotigobba 3");
		c.add("Natasaarvabhowma");
		c.add("KGF 2");
		
		c.remove("Kotigobba 3");
		c.forEach(System.out::println);
		
	}
}
