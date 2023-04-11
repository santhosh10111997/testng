package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinAdress extends BaseClass {

	public AdactinAdress() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement txtname;
	@FindBy(id="last_name")
	private WebElement txtlastname;
	@FindBy(id="address")
	private WebElement txtaddress;
	@FindBy(id="cc_num")
	private WebElement txtcardno;
	@FindBy(id="cc_cvv")
	private WebElement txtcvv;
	
	public WebElement getTxtname() {
		return txtname;
	}
	public WebElement getTxtlastname() {
		return txtlastname;
	}
	public WebElement getTxtaddress() {
		return txtaddress;
	}
	public WebElement getTxtcardno() {
		return txtcardno;
	}
	public WebElement getTxtcvv() {
		return txtcvv;
	}
	
	public void getdetails() {
		sendKeys(getTxtname(), "sandy");
		sendKeys(getTxtlastname(), "3456");
        sendKeys(getTxtaddress(), "abdc");
        sendKeys(getTxtcardno(), "1234567890987654");
        sendKeys(getTxtcvv(), "hfug");
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
