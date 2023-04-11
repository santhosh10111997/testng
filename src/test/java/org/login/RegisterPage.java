package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BaseClass {
	public RegisterPage() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement btngopage;

	@FindBy(name="firstname")
	private WebElement txtfirstname;
	
	@FindBy(name="lastname")
	private WebElement txtlastname;
	
	@FindBy(name="websubmit")
	private WebElement btnSignup;

	

	public WebElement getBtngopage() {
		return btngopage;
	}

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getBtnSignup() {
		return btnSignup;
	}
	
	public void getregister(String fisrname,String lastname) {
		Click(getBtngopage());
		sendKeys(getTxtfirstname(), fisrname);
		sendKeys(getTxtlastname(), lastname);
		Click(getBtnSignup());

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
