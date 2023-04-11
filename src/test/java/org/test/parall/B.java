package org.test.parall;

import org.testng.annotations.Test;

public class B {
	
	
	@Test
	private void testB1() {
		System.out.println("testB1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testB2() {
		System.out.println("testB2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testB3() {
		System.out.println("testB3");
		System.out.println(Thread.currentThread().getId());
	}
}
