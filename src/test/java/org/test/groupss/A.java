package org.test.groupss;

import org.testng.annotations.Test;

public class A {
	
	@Test(groups= {"smoke","regression"})
	private void testA1() {
		System.out.println("testA1");

	}
	@Test(groups= {"sanity","regression"})
	private void testA2() {
		System.out.println("testA2");

	}
	@Test(groups="regression")
	private void testA3() {
		System.out.println("testA3");

	}

@Test(groups="retest")
private void testA4() {
	System.out.println("testA4");

}
@Test(groups= {"smoke","regression"})
private void testA5() {
	System.out.println("testA5");

}
@Test(groups= {"sanity","regression"})
private void testA6() {
	System.out.println("testA6");

}
@Test(groups="regression")
private void testA7() {
	System.out.println("testA7");

}
@Test(groups= {"smoke","regression"})
private void testA8() {
	System.out.println("testA8");

}
@Test(groups= {"sanity","regression"})
private void testA9() {
	System.out.println("testA9");

}


}































