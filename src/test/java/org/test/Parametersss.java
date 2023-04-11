package org.test;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametersss {
	
	@Parameters({"username","password"})
	@Test
	private void testA1(@Optional("sandy")String name,@Optional("8989")String pass) {
		System.out.println(name);
		System.out.println(pass);
		System.out.println("testA1");

	}
	@Parameters("username")
	@Test
	private void testA2(@Optional("rohit")String name) {
		System.out.println(name);
		System.out.println("testA2");

	}
	
	@Test
	private void testA3() {
		System.out.println("testA3");

	}
}
 