package com.techment.day7;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList o1 = new LinkedList();
		o1.add(1);
		o1.add(2);
		o1.addLast(101);
		o1.add(4);
		o1.addFirst(100);
		
		
		System.out.println("Linked list "+o1);
		
		o1.removeLast();
		System.out.println("Linked list "+o1);


	}

}
