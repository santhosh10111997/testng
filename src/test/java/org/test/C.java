package org.test;

import org.testng.annotations.Test;

public class C {
	
	
	@Test
	private void testC1() {
		System.out.println("testC1");
System.out.println(10/0);
	}
	
	@Test
	private void testC2() {
		System.out.println("testC2");

	}
	
	@Test
	private void testC3() {
		System.out.println("testC3");

	}
}
