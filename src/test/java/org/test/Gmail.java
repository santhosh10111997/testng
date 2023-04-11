package org.test;

import java.util.Date;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;

public class Gmail extends BaseClass{
    @BeforeClass
	private void Beforeclass() {
		BrowserLaunch("chrome");
		maximize();
		implicitlyWait(5);
		
		
	}
    @AfterClass
	private void Afterclass() throws InterruptedException {
    	Thread.sleep(9000);
		quit();
        System.out.println("end");
	}
    @BeforeMethod
	private void Beforemethod() {
	Date d=new Date();
    System.out.println("start time "+d);
	}
    @AfterMethod
	private void aftermethod() {
		Date d=new Date();
		System.out.println("end time"+d);

	}
    @Test
	private void Test() {
    	urlLaunch("https://accounts.google.com/v3/signin/identifier?dsh=S1057590236%3A1664432218843208&continue=https%3A%2F%2Fmyaccount.google.com%2Finactive&followup=https%3A%2F%2Fmyaccount.google.com%2Finactive&osid=1&passive=1209600&service=accountsettings&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWodCJL2xqOKQ7kApv6p_-ktUtFLQSWzLEQvtKqZLWcVx2VomTPHXobhDV78j9c3mnalxINd5g");
	WebElement user = driver.findElement(By.id("identifierId"));
    sendKeys(user, "sandytambasandy@gmail.com");
    WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
    next.click();
    
	}
	
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
