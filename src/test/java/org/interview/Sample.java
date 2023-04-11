package org.interview;
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
import org.testng.ITestResult;
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
	private void afterMethod(ITestResult r) throws IOException {
		
//		String name = r.getName();
//		int status = r.getStatus();
//		if(status==2) {
//			screenshot("fb" +name);
//		}
//		
//		Date d=new Date();
//		System.out.println("end time"+d);
	}
	@Ignore
	@Test(priority=-1,invocationCount=5,enabled=false)
	private void test1() {
		System.out.println("test1");
	}
	@Test(priority=0)
	private void test3() throws InterruptedException, IOException {
	
		urlLaunch("https://www.facebook.com/");
		Loginnf l=new Loginnf();
		sendKeys(l.getTxtUsername(), "sandy");
		Assert.assertTrue(false);
		sendKeys(l.getTxtPassword(), "rohit");
		Click(l.getBtnLogin());
		Thread.sleep(4000);
		System.out.println("test3");
		
		
		
	}
	
	@Test(priority=2)
	private void test2() throws IOException{
		
		urlLaunch("https://www.facebook.com/");
		RegisterPage r=new RegisterPage();
	    Click(r.getBtngopage());
	    sendKeys(r.getTxtfirstname(), "virat");
	    Assert.assertTrue(false);
	    sendKeys(r.getTxtlastname(), "kohli");
	    Click(r.getBtnSignup());
		System.out.println("test2");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
