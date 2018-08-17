package com.qa.quickstart.cucumber2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
	
	String User = "Admin";
	String Pass = "AdminAdmin";
 
	@FindBy(id="txtUsername")
	 private WebElement box1;
	
	@FindBy(id="txtPassword")
	private WebElement box2;
	
	@FindBy(id="btnLogin")
	private WebElement Button;
	
	public void boxfill() {
		
		box1.sendKeys(User);
		box2.sendKeys(Pass);
		Button.click();
	}
	
	
	
}
