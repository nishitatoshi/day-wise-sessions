package com.techment.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(20);
		nums.add(8);
		nums.add(12);
		nums.add(15);


		System.out.println(nums);
		
		nums.forEach(s->System.out.println(s));

		nums.forEach(System.out::println);
		
		System.out.println("after sorting");
		nums.stream().sorted().forEach(System.out::println);
		
		//ascending order or natural sort
		List<Integer> mySorted = nums.stream().sorted().collect(Collectors.toList());
		System.out.println(mySorted);
		
		//descending order
		List<Integer> myReverse = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(myReverse);
	}

}
