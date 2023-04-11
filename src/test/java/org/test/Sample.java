package org.test;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		System.out.println("Before class");
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("before class");
		
	}
	@AfterClass
	private void afterClass() {
	//	driver.quit();
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
//	}
//	@Ignore
//	@Test(priority=-1,invocationCount=5,enabled=false)
//	private void test1() {
//		System.out.println("test1");
	}
	@Test(dataProvider="sandy",dataProviderClass=A.class)
	private void test3(String username, String password) throws InterruptedException {
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
       txtuser.sendKeys(username);
       WebElement txtpass = driver.findElement(By.id("pass"));
       txtpass.sendKeys(password);
       WebElement btnclick = driver.findElement(By.name("login"));
       btnclick.click();
       Thread.sleep(4000);
       System.out.println("test3");
	}
	
//	
//	@Test(priority=2)
//	private void test2() throws InterruptedException {
//		Thread.sleep(4000);
//		driver.get("https://www.facebook.com/");
//		WebElement btncreate = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		btncreate.click();
//		WebElement txtfirst = driver.findElement(By.name("firstname"));
//		txtfirst.sendKeys("sandy");
//		WebElement txtlast = driver.findElement(By.name("lastname"));
//		txtlast.sendKeys("tamba");
//		WebElement btnsign = driver.findElement(By.name("websubmit"));
//		btnsign.click();
//		
//		System.out.println("test2");
//		
//	}
//	
////	@Test
////	private void test5() throws IOException, InterruptedException {
////		Thread.sleep(3000);
////		TakesScreenshot t=(TakesScreenshot)driver;
////		File src = t.getScreenshotAs(OutputType.FILE);
////		File fi=new File("C:\\Users\\pavithra\\eclipse-workspace\\MavenNew\\screenshot\\omg.png");
////        FileUtils.copyFile(src, fi);
////		
////		System.out.println("okay dude");
////		
////		
////		
////		
////	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
