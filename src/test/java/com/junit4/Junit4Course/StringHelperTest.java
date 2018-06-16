package com.junit4.Junit4Course;

import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass");
	}
	
	@Before
	public void before() {
		System.out.println("Before");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	@Test(expected = NullPointerException.class)
	public void testException() {
		int[] numbers = {};
		Arrays.sort(numbers);		
	}

	@Test(timeout = 1000)
	public void testPerformance() {
		int array[] = {12, 23, 4};
		for (int i=1;i<=1000000;i++) {
			array[0] = i;
			Arrays.sort(array);
		}
	}
}
