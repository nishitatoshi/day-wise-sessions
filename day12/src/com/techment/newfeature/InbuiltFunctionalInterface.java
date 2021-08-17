package com.techment.newfeature;

import java.util.function.Function;
import java.util.function.Predicate;

public class InbuiltFunctionalInterface {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (num) -> num>18;
		System.out.println(predicate.test(20));
		Predicate<String> strPredicate = (name)->name.contains("a");
		System.out.println(strPredicate.test("Nishita"));
		
		
		Function<Integer, Integer> function1 = (num1) -> num1;
		Function<Integer, String> function2 = (num1) -> "value of= "+ num1;
		Function<String, Integer> function3 = (num1) -> num1.length();
		
		System.out.println(function1.apply(2));
		System.out.println(function2.apply(4));
		System.out.println(function3.apply("nishita"));


	}

}
