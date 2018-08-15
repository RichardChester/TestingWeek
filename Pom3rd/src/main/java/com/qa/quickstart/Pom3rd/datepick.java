package com.qa.quickstart.Pom3rd;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class datepick {

	@FindBy(id = "datepicker1")
	private WebElement box1;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table")
	private WebElement dates;
	
	@FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")
	private WebElement date;
	

	

	
	public void pick() {
		
		box1.click();
		date.click();
		assertEquals("August 17, 2018", box1.getAttribute("value"));
	}		
} 