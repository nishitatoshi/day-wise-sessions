package com.techment.day7;
import java.util.ArrayList;
public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		int a=1;
		Integer b=a;
		ArrayList obj = new ArrayList();
		System.out.println("size before adding the elements "+obj.size());
		obj.add(1);
		obj.add("Sachin");
		obj.add(24.50);
		System.out.println("size after adding the elements "+obj.size());
		System.out.println("elements in the list "+obj);
		
		obj.add(1, "hello");
		System.out.println("after adding 1st index "+obj);
		obj.remove("hello");
		System.out.println("after removing hello  "+obj);
		obj.remove(Integer.valueOf(1));
		System.out.println("after removing 1  "+obj);
		System.out.println("after removing hello  "+obj);
		System.out.println("element at 1  "+obj.get(1));


	}

}
