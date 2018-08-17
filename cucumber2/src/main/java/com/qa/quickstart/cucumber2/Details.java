package com.qa.quickstart.cucumber2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Details {
	
	String Fname = "Dickie";
	String Mname = "Colin";
	String Lname = "Chester";
	String Uname = "RattyRich3";
	String Pword = "HammerTime";
 
	@FindBy(id="firstName")
	 private WebElement boxF;
	
	@FindBy(id="middleName")
	private WebElement boxM;
	
	@FindBy(id="lastName")
	private WebElement boxL;
	
	@FindBy(xpath="//*[@id=\"location_inputfileddiv\"]/div/input")
	private WebElement Dbox;
	
	@FindBy(xpath="//*[@id=\"pimAddEmployeeForm\"]/div[1]/div/materializecss-decorator[3]/div/sf-decorator/div/label")
	private WebElement create;
	
	@FindBy(id="username")
	 private WebElement boxU;
	
	@FindBy(id="password")
	 private WebElement boxP;
	
	@FindBy(id="confirmPassword")
	 private WebElement boxPC;
	
	@FindBy(xpath="//*[@id=\"adminRoleId_inputfileddiv\"]/div/input")
	private WebElement Sbox;
	
	@FindBy(id="systemUserSaveBtn")
	 private WebElement Sbut;

	
	
	public void user(WebDriver driver, Actions action){
		
		WebDriverWait listhold = new WebDriverWait(driver, 30);
		listhold.until(ExpectedConditions.visibilityOf(boxL));
		
		boxF.sendKeys(Fname);
		boxM.sendKeys(Mname);
		boxL.sendKeys(Lname);
		Dbox.click();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ARROW_DOWN).perform();
		action.sendKeys(Keys.ENTER).perform();
		
		
	}
	
	public void click(){
		
		  create.click();	
	}
	
	
	
	public void logins(Actions action){
			
		  boxU.sendKeys(Uname);
		  boxP.sendKeys(Pword);
		  boxPC.sendKeys(Pword);
		  Sbox.click();
		  action.sendKeys(Keys.ARROW_DOWN).perform();
		  action.sendKeys(Keys.ENTER).perform();
		
	
		
	}
	
	public void click2(){
		
		  Sbut.click();	
	}
	
	
	
}
