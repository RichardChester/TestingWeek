package com.qa.quickstart.Pom3rd;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tool {


	@FindBy(xpath = "/html/body/div[5]/div[1]")
	private WebElement div;
	
	@FindBy(id = "age")
	private WebElement age;


	

	
	public void tooly() {
		
		age.click();
		assertEquals("We ask for your age only for statistical purposes.", div.getText());						 				 				 
	}		
} 