package org.test.dataproviderrr;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A {
	@Test
	private void testA1() {
		System.out.println("testA1");
		System.out.println(Thread.currentThread().getId());

	}
	
	@Test(dataProvider="login")
	private void testA2(String username,String password) {
		System.out.println(username);
		System.out.println(password);
		System.out.println("testA2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test(dataProvider="create")
	private void testA3(String firstname,String lastname) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println("testA3");
		System.out.println(Thread.currentThread().getId());
	}
	
	@DataProvider(name="login",indices= {1,2},parallel=true)
	private Object[][] datas() {
		//datatype variablename[][]=new datatype[r size][c size];
		Object[][] obj=new Object[][] {
			{"san@gmail.com","23242"},
			{"sandy@gmail.com","asad"},
			{"tamba@gmail.com","2345"},
			{"games@gmail.com","hdbjsabd"}
			
			
		};
		return obj;

	}
	@DataProvider(name="create")
	private Object[][] reg() {
		Object[][] obj=new Object[][] {
			{"sandy","man"},
			{"randy","man"},
			{"lonly","man"},
			{"lovely","man"}
			
		};
		return obj;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
