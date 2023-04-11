package org.test.assertt;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.login.Loginnf;
import org.login.RegisterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
	public WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		BrowserLaunch("chrome");
		maximize();
		implicitlyWait(10);
		System.out.println("before class");
		
	}
	@AfterClass
	private void afterClass() {
		quit();
		System.out.println("After class");
	}
	@BeforeMethod
	private void beforeMethod() {
		Date d=new Date();
		System.out.println("start time"+d);
	}
	@AfterMethod
	private void afterMethod() {
		Date d=new Date();
		System.out.println("end time"+d);
	}
	@Ignore
	@Test(priority=-1,invocationCount=5,enabled=false)
	private void test1() {
		System.out.println("test1");
	}
	@Test(priority=0,enabled=true)
	private void test3() throws InterruptedException {
		SoftAssert s=new SoftAssert();
		//verify url
		urlLaunch("https://www.facebook.com/");
		String currentUrl = currentUrl();
		boolean b = currentUrl.contains("Facebook");
		s.assertTrue(b,"verify url");
		
		Loginnf l=new Loginnf();
		//verify userName
		sendKeys(l.getTxtUsername(), "sandy");
		String atuser = getAttribute(l.getTxtUsername());
		s.assertEquals(atuser, "sandy","verify user");
		//verify password
		sendKeys(l.getTxtPassword(), "rohit");
		String atpass = getAttribute(l.getTxtPassword());
		s.assertEquals(atpass, "rohit","verify pass");
		//verify valid page
		Click(l.getBtnLogin());
		Thread.sleep(4000);
		String url = currentUrl();
		boolean contains = url.contains("?privacy_mutation_token");
		s.assertTrue(contains,"valid or invalid");
		s.assertAll();
		System.out.println("test3");
		
		
		
	}
	
	@Test(priority=2)
	private void test2(){
		
		urlLaunch("https://www.facebook.com/");
		RegisterPage r=new RegisterPage();
	    Click(r.getBtngopage());
	    sendKeys(r.getTxtfirstname(), "virat");
	    sendKeys(r.getTxtlastname(), "kohli");
	    Click(r.getBtnSignup());
		System.out.println("test2");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
