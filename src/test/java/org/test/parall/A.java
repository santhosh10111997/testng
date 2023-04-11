package org.test.parall;

import org.testng.annotations.Test;

public class A {
	
	
	@Test
	private void testA1() {
		System.out.println("testA1");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testA2() {
		System.out.println("testA2");
		System.out.println(Thread.currentThread().getId());
	}
	
	@Test
	private void testA3() {
		System.out.println("testA3");
        
	} 
}
