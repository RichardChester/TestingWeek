package com.qa.quickstart.Pom3rd;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class menu {

	@FindBy(xpath = "//*[@id=\"navigate\"]/ul/li[1]")
	private WebElement Hbox;
	
	public void hover(Actions action) {
		
		
		
		 action.moveToElement(Hbox).perform();
		 assertEquals("rgba(255, 153, 0, 1)", Hbox.getCssValue("background-color"));
		 
				 
	}
	
} 