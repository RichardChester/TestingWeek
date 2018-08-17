package com.qa.quickstart.cucumber2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
	

	@FindBy(xpath="//*[@id=\"menu_pim_viewPimModule\"]/a/span[3]")
	 private WebElement Pim;
	
	@FindBy(xpath="//*[@id=\"menu_pim_addEmployee\"]/span[2]")
	private WebElement Make;
	
	@FindBy(xpath="//*[@id=\"menu_pim_viewEmployeeList\"]/span[2]")
	private WebElement find;
	
	

	
	public void Pim() {
		
		Pim.click();
		
	}
	
	public void New(WebDriver driver) {
		WebDriverWait listhold = new WebDriverWait(driver, 10);
		listhold.until(ExpectedConditions.visibilityOf(Make));
		Make.click();
	}
	
	public void check (WebDriver driver) {

		find.click();
	}
	
}