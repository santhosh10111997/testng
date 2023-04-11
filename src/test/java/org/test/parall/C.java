package org.test.parall;

import org.testng.annotations.Test;

public class C {
	
	
	@Test
	private void testC1() {
		System.out.println("testC1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testC2() {
		System.out.println("testC2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testC3() {
		System.out.println("testC3");
		System.out.println(Thread.currentThread().getId());
	}
}
