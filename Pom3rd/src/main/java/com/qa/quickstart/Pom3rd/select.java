package com.qa.quickstart.Pom3rd;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class select {

	@FindBy(xpath = "//*[@id=\"selectable\"]/li[1]")
	private WebElement box1;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[2]")
	private WebElement box2;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[3]")
	private WebElement box3;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[4]")
	private WebElement box4;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[5]")
	private WebElement box5;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[6]")
	private WebElement box6;
	
	@FindBy(xpath = "//*[@id=\"selectable\"]/li[7]")
	private WebElement box7;
	

	
	public void cycle() {
		
		box1.click();
		box2.click();
		box3.click();
		box4.click();
		box5.click();
		box6.click();
		box7.click();
		
	}
	
	public boolean checkCycle() {
		
		boolean isSelected = false;
		
		if(box7.getAttribute("class").contains("selected")) {
			isSelected = true;
		}
		
		return isSelected;
		
	}
	
}