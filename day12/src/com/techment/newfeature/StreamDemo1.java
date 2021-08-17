package com.techment.newfeature;

import java.util.ArrayList;

public class StreamDemo1 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(20);
		System.out.println(nums);
		nums.stream().forEach(i->System.out.println(i));
		nums.stream().forEach(System.out.println());

	}

}
