package com.techment.day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;


public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1,"nishi");
		hm.put(2,"jahnvi");
		hm.put(3,"mohima");
		hm.put(4,"himanshi");
		System.out.println("HashMap "+hm);
		
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1,"nishi");
		lhm.put(2,"jahnvi");
		lhm.put(3,"mohima");
		lhm.put(4,"himanshi");
		System.out.println("LinkedHashMap "+hm);
		
		TreeMap tm = new TreeMap();
		tm.put(1,"nishi");
		tm.put(2,"jahnvi");
		tm.put(5,"mohima");
		tm.put(4,"himanshi");
		System.out.println("TreeMap "+tm);
		
		HashMap<String, String> hmm= new HashMap<String, String>();
		hmm.put("dhoni", "is captiain cool");
		hmm.put("dravid", "is coach");
		
		System.out.println("Hashmap "+hmm);
		for(Entry<String, String> e:hmm.entrySet())
		{
			System.out.println(e);
			System.out.println(e.getKey());
			System.out.println(e.getValue());

		}
		System.out.println("Printing values");
		

		


	}

}
