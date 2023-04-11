package org.rerun;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(WithoutknownFaild.class)
public class A {

	@Test
	private void testA1() {
		System.out.println("testA1");

	}

	@Test(retryAnalyzer = With.class)
	private void testA2() {
		System.out.println("testA2");
		Assert.assertTrue(new Scanner(System.in).nextBoolean());
	}

	@Test
	private void testA3() {
		System.out.println("testA3");

	}
}