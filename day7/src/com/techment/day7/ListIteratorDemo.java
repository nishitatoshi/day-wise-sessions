package com.techment.day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ListIteratorDemo {
	
	public static void main(String[] args)
	{
		ArrayList<Integer> o1=new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);

		
		System.out.println("elements of o1 "+o1);
		
		ListIterator<Integer> itr = o1.listIterator();
		
		System.out.println("forwrd");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());

		}
		
        System.out.println("backward");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());

		}

	}

}
