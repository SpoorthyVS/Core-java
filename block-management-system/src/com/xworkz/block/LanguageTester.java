package com.xworkz.block;

import com.xworkz.block.dto.LanguageDTO;

public class LanguageTester {

	public static void main(String a[]) {
		
		LanguageDTO la = new LanguageDTO();
		la.setId(1);
		la.setSerialNo(9780758745L);
		la.setName("Memory");
		la.setGroup('b');
		
//		boxing
		Integer id = la.getId();
//		unboxing
		int id1 = id.intValue();
		System.out.println(la.getId());
		
		Long sNo = la.getSerialNo();
		long serialNo = sNo.longValue();
		System.out.println(la.getSerialNo());
		
		
		Character ch = la.getGroup();
		char group = ch.charValue();
		System.out.println(la.getGroup());
		
		
		
		System.out.println(la.getId());
		System.out.println(la);
		
		
	}
	
}
