package com.qa.quickstart.Pom3rd;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class slider {

	@FindBy(xpath = "//*[@id=\"slider-range-max\"]/div")
	private WebElement slider;
	
	@FindBy(xpath = "//*[@id=\"amount1\"]")
	private WebElement numb;

	
	
	public void slide() {
		
		slider.click();
		assertEquals("6", numb.getAttribute("value"));
		

	}		
} 