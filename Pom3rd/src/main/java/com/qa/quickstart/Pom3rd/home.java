package com.qa.quickstart.Pom3rd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class home {

	@FindBy(xpath = "//*[@id=\"menu-item-141\"]/a")
	private WebElement drop;
	
	@FindBy(xpath = "//*[@id=\"menu-item-142\"]")
	private WebElement select;
	
	@FindBy(xpath = "//*[@id=\"menu-item-144\"]")
	private WebElement acordian;
	
	@FindBy(xpath = "//*[@id=\"menu-item-145\"]")
	private WebElement comp;
	
	@FindBy(xpath = "//*[@id=\"menu-item-146\"]")
	private WebElement date;
	
	@FindBy(xpath = "//*[@id=\"menu-item-147\"]")
	private WebElement menu;
	
	@FindBy(xpath = "//*[@id=\"menu-item-97\"]/a")
	private WebElement slid;
	
	@FindBy(xpath = "//*[@id=\"menu-item-98\"]/a")
	private WebElement tab;
	
	@FindBy(xpath = "//*[@id=\"menu-item-99\"]/a")
	private WebElement tool;
	
	
	public void dropTest() {
		drop.click();
		
	}
	
	public void selectTest() {
		select.click();
		
	}
	
	public void acordianTest() {
		acordian.click();
		
	}
	
	public void comptest() {
		comp.click();
		
	}
	
	public void datetest() {
		date.click();
		
	}
	
	public void menutest() {
		menu.click();
		
	}
	
	public void slidetest() {
		slid.click();
		
	}
	
	public void tabtest() {
		tab.click();
		
	}
	
	public void tooltest() {
		tool.click();
		
	}
	
}
