package org.test.groupss;

import org.testng.annotations.Test;

public class B {
	
	
	@Test
	private void testB1() {
		System.out.println("testB1");

	}
	
	@Test
	private void testB2() {
		System.out.println("testB2");

	}
	
	@Test(enabled=false)
	private void testB3() {
		System.out.println("testB3");

	}
}
