package org.test;

import java.util.Date;
import java.util.List;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class TaskManoj extends BaseClass{

	@BeforeClass
	private void BeforeClass() {
		BrowserLaunch("chrome");
		maximize();
		implicitlyWait(8);
		System.out.println("before class");

	}
	@AfterClass
	private void AfterClass() throws InterruptedException {
		Thread.sleep(5000);
        quit();
        System.out.println("after class");
	}
	
	@BeforeMethod
	private void BeforeMethod() {
		Date d=new Date();
		System.out.println("start time"+d);

	}
	@AfterMethod
	private void AfterMethod() {
		Date d=new Date();
		System.out.println("end time"+d);

	}
	@Test(priority=0)
	private void Test1() {
		urlLaunch("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtsearch.sendKeys("oneplus");
		
		WebElement products = driver.findElement(By.className("s-heavy"));
		Actions a=new Actions(driver);
       
      //  List<String> li=new ArrayList<String>();
       List<WebElement> b = driver.findElements(By.className("s-heavy"));
        a.moveToElement(products);
        for(int i=0;i<b.size();i++) {
        	WebElement t = b.get(i);
        	String text = t.getText();
        	System.out.println(text);
        }        
//        for(WebElement x:b) {
//        	li.add(x.getText());
//        }
//        System.out.println("print text"+li);
        
	}
}
