package org.base;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basee {
	public static WebDriver driver;
	public static  WebDriver browserLaunch(String name) {
		if(name.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
		}
		else if (name.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		return driver;
	}
	public static void browserlaunchh(String browsername) {
		switch (browsername) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
				break;
				case "edge":
					WebDriverManager.edgedriver().setup();
					 driver=new EdgeDriver();
					break;
				}
	}
    public static void js(String name,WebElement e) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
   js.executeScript("arguments[0].setAttribute('value,'"+name+"')", e);
}
public static void movetoelement(WebElement e) {
	Actions a= new Actions(driver);
a.moveToElement(e);
}
//}
//public static void getWindow() {
//	String windowHandle =driver. getWindowHandle();
//	Set<String> windowHandles =driver.getWindowHandles();
//
//	for(String x:windowHandles) {
//		if(!windowHandle.equals(windowHandles)) {
//			driver.switchTo().window(x);
//    
}




































