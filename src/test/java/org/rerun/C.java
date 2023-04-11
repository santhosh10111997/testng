package org.rerun;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners()
public class C {
	
	
	@Test(retryAnalyzer = With.class)
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
