package com.techment.newfeature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream2Demo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=1; i<=10; i++)
		{
			numbers.add(i);
		}
		System.out.println("numbers "+ numbers);
		
		System.out.println("printing only even numbers..");
		numbers.stream().filter(num->num%2==0).forEach(s->System.out.println(s));
		System.out.println("by map");
		numbers.stream().map(num->num+5).forEach(s->System.out.println(s));
		numbers.stream().map(num->"after adding 100: "+(num+100)).forEach(s->System.out.println(s));
        
		numbers.stream().limit(2).forEach(s->System.out.println(s));
		
		Long size = numbers.stream().count();
		System.out.println("no. of elements "+ size);
		List<Integer> nu = Arrays.asList(1,2,3,4);

	}

}
