package com.qa.quickstart.Pom3rd;

import static org.junit.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autocomp {

	@FindBy(id = "tagss")
	private WebElement tbox;
	
	@FindBy(id = "ui-id-1")
	private WebElement list;
	

	
	public void comping(Actions action,WebDriver driver) {
		 
		 tbox.click();
		 tbox.sendKeys("script");
		 
		 
		WebDriverWait listhold = new WebDriverWait(driver, 10);
		 listhold.until(ExpectedConditions.visibilityOf(list));
		 
		 List<WebElement> results = list.findElements(By.className("ui-menu-item"));
		 String first =results.get(0).getAttribute("innerHTML");
		 results.get(0).click();
		 assertEquals(first, tbox.getAttribute("value"));
				 
	}
	
} 