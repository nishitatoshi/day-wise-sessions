package com.techment.day7;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		
		System.out.println("elements of o1 "+o1);
		
		Iterator<Integer> itr = o1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}

	}

}
