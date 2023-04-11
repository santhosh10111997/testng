package org.login;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactionRoom extends BaseClass{

	public AdactionRoom() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(id="location")
	private WebElement location; 
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="Submit")
	private WebElement submit;
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement continu;
	
	
	public WebElement getLocation() {
		return location;
	}



	public WebElement getRadio() {
		return radio;
	}



	public WebElement getContinu() {
		return continu;
	}



	public WebElement getHotels() {
		return hotels;
	}



	public WebElement getRoomtype() {
		return roomtype;
	}



	public WebElement getSubmit() {
		return submit;
	}



	public void getSelect() {
		Click(getLocation());
		Click(getHotels());
		Click(getRoomtype());
		Click(getSubmit());
		Click(getRadio());
		Click(getContinu());
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
