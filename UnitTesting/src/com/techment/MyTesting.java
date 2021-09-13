package com.techment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyTesting {

	Calculation calculation = new Calculation();
	
	@Before
	void test10()
	{
		//System.out.println("before test");
		assertTrue(true);
	}
	
	@BeforeEach
	void test11()
	{
		assertTrue(true);
		System.out.println("before each test");

	}
	
//	@BeforeAll
//	void test12()
//	{
//		assertTrue(true);
//		System.out.println("before all test");
//
//	}
	
	@Test
	void test() {
		assertEquals(5, calculation.add(2, 4));
		System.out.println("test");
	}
	
	@Test
	void test2()
	{
		assertNotEquals(6, calculation.add(2, 4));
		System.out.println("test2");

	}

	@Test
	void test3()
	{
		assertEquals("eligible", calculation.checkEligibility(22));
		System.out.println("test3");

	}
	
	@Test
	void test4()
	{
		assertFalse(calculation.name.contains("sachin"));
		System.out.println("test4");

	}
	
	@Test
	void test5()
	{
		assertThrows(ArithmeticException.class, ()->{int a=1; int b=0; System.out.println(a/b);});
		System.out.println("test5");

	}
	
	@Test
	void test6()
	{
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("1");});
		System.out.println("test6");

	}
	
	@Test
	void test7()
	{
		assertThrows(IllegalArgumentException.class, ()->{Integer.parseInt("ab");});
		System.out.println("test7");

	}
	
}	