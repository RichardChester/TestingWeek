package com.qa.quickstart.Pom3rd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tabs {

	@FindBy(xpath = "//*[@id=\"tabs222\"]/ul/li[3]")
	private WebElement tab;
	
	public void tab() {
		
		tab.click();
		
	}
	
	public boolean checktab(){
	boolean isSelected = false;
	if(tab.getAttribute("class").contains("ui-state-active")) {
		isSelected = true;
		}	
	
	  return isSelected;
	}
	
}