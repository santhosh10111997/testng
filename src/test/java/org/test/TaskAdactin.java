package org.test;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.login.AdactinAdress;
import org.login.AdactionRoom;
import org.login.LoginAdactin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TaskAdactin extends BaseClass {
	
	@BeforeClass
	private void BeforeClass() {
		BrowserLaunch("chrome");
		maximize();
		implicitlyWait(10);
        System.out.println("before class");
	}
	@AfterClass
	private void afterClass() throws InterruptedException {
		Thread.sleep(5000);
		quit();
        System.out.println("after class");
	}
	@BeforeMethod
	private void before() {
		Date d=new Date();
       System.out.println("start time"+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("end time"+d);
	}
	@Test(priority=0)
	
	private void Test1() throws InterruptedException {
		
		SoftAssert s=new SoftAssert();
		
	urlLaunch("https://adactinhotelapp.com/");	
    //verify url
	String url = currentUrl();
	boolean contains = url.contains("adactinhotelapp");
	s.assertTrue(contains);
	
	LoginAdactin l=new LoginAdactin();
	
	sendKeys(l.getTxtuser(), "suryajoo");
	//verify username
	String atuser = getAttribute(l.getTxtuser());
	s.assertEquals(atuser, "suryajoo","user okay");
	
	sendKeys(l.getTxtpass(), "Sharma@45");
	//verify password
	String atpass = getAttribute(l.getTxtpass());
	s.assertEquals(atpass, "Sharma@45","password okay");
	
	Click(l.getBtnlogin());
	//verify invalidpage or valid page
	String url2 = currentUrl();
	boolean con2 = url2.contains("SearchHotel");
	s.assertTrue(con2);
	s.assertAll();
	Thread.sleep(3000);
	}
	
//	@Test(priority=1)
//	private void test2() {
//		
//	}
	@Test (priority=1)
	private void Test2() {
	//	SoftAssert sa=new SoftAssert();
		//urlLaunch("https://adactinhotelapp.com/SearchHotel.php");
		AdactionRoom a=new AdactionRoom();
       Click(a.getLocation());
   Select s=new Select(a.getLocation());
   s.selectByIndex(2);
   Select s1=new Select(a.getHotels());
		Click(a.getHotels());
		s1.selectByIndex(2);
		Select s2=new Select(a.getRoomtype());
		Click(a.getRoomtype());
		s2.selectByIndex(2);
		Click(a.getSubmit());
		Click(a.getRadio());
		Click(a.getContinu());
		
	}
		@Test(priority=2)
		private void Test3() throws IOException {
			AdactinAdress ad=new AdactinAdress();
		sendKeys(ad.getTxtname(), getExcel("TestNGClass", "testng", "Sheet1", 1, 1));
        sendKeys(ad.getTxtlastname(), getExcel("TestNGClass", "testng", "Sheet1",2 ,1 ));
		sendKeys(ad.getTxtaddress(), getExcel("TestNGClass", "testng", "Sheet1",3 ,1 ) );
		sendKeys(ad.getTxtcardno(),  getExcel("TestNGClass", "testng", "Sheet1",4 ,1 ));
		sendKeys(ad.getTxtcvv(), getExcel("TestNGClass", "testng", "Sheet1",5 ,1 ));
		
		}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
