package com.qa.quickstart.cucumber2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class List {
	
	String Fname = "Dickie ";
	String Mname = "Colin ";
	String Lname = "Chester";

	@FindBy(xpath="//*[@id=\"employee_name_quick_filter_employee_list_value\"]")
	 private WebElement search;
	
	@FindBy(xpath="//*[@id=\"employee_name_quick_filter_employee_list_dropdown\"]/div[3]")
	 private WebElement listy;
	
	@FindBy(xpath="//*[@id=\"employeeListTable\"]/tbody/tr/td[3]")
	 private WebElement me;
	
	@FindBy(xpath="//*[@id=\"employeeListTable\"]/tbody/tr/td[3]")
	 private WebElement checky;
	
  

	
	public void search(Actions action) throws InterruptedException {
		
		search.sendKeys(Fname);
		search.sendKeys(Mname);
		search.sendKeys(Lname);
				
	}
	
public void search2 (Actions action, WebDriver driver) throws InterruptedException {
	
		WebDriverWait listhold = new WebDriverWait(driver, 30);
		listhold.until(ExpectedConditions.visibilityOf(listy));
		action.sendKeys(Keys.ENTER).perform();				
		Thread.sleep(10000); //i was running short on time and wanted to include some reporting				
		me.click();
		
	}

	
}