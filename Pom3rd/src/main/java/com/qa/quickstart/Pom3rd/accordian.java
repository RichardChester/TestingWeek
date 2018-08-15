package com.qa.quickstart.Pom3rd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class accordian {

	@FindBy(xpath = "//*[@id=\"ui-id-10\"]")
	private WebElement box4;
	
	public void acord() {
		
		box4.click();
		
	}
	
	public boolean checkacord(){
	boolean isSelected = false;
	if(box4.getAttribute("class").contains("ui-state-active")) {
		isSelected = true;
		}	
	
	  return isSelected;
	}
	
}