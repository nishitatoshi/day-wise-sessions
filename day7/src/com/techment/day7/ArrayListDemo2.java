package com.techment.day7;
import java.util.ArrayList;
public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList a1 = new ArrayList();//can store any type of object
		a1.add(1);
		a1.add("Sachin");
		
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();//default capacity is 10
		a2.add(1);
		//a2.add("abc");
		
		ArrayList<String> a3 = new ArrayList<String>(100);//new capacity is 100
		//a3.add(1);
		a3.add("abc");

	}

}
