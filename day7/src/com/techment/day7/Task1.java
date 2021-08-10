package com.techment.day7;
import java.util.ArrayList;
import java.util.Collections;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> b1 = new ArrayList<String>();
		b1.add("sachin");
		b1.add("ravi");
		b1.add("kumar");
		b1.add("soumya");
		
		System.out.println("elements of b1 are "+b1);

		ArrayList<String> b2 = new ArrayList<String>();
		b2.add("sourabh");
		b2.add("manish");
		b2.add("sachin");
		b2.add("ankit");
		b2.add("kumar");
		
		System.out.println("elements of b2 are "+b2);
		
		b2.addAll(b1);
		b2.removeAll(b1);
		
		ArrayList<String> s = new ArrayList<String>();
		s.addAll(b1);
		s.addAll(b2);
		Collections.sort(s);



		System.out.println("merged and sorted elements are "+s);


	}

}
