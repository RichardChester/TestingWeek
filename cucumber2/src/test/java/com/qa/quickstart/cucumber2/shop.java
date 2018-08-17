package com.qa.quickstart.cucumber2;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shop {
	
	
	WebDriver driver = null;
	Actions action =null;
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\TestingWeek\\cucumber2\\assess.html", true);
	
	ExtentTest test;
	
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Development\\chromedriver.exe");
		driver = new ChromeDriver();
		action = new Actions(driver);
		
		
	}
	
	@Given("^the login page$")
	public void the_login_page() throws Throwable {
		test = extent.startTest("Verify the login page displays");
		driver.get("https://qa-trials641.orangehrmlive.com/auth/login");
		test.log(LogStatus.INFO, "login page open");
	    
	}

	@When("^I login$")
	public void i_login() throws Throwable {
		test = extent.startTest("Verify I can login");
		Login page = PageFactory.initElements(driver, Login.class);
		test.log(LogStatus.INFO, "I logged in");

		page.boxfill();
	   ;
	}

	@When("^I click the PIM tab$")
	public void i_click_the_PIM_tab() throws Throwable {
		test = extent.startTest("VerifyI click the PIM tab");
		Home page = PageFactory.initElements(driver, Home.class);
		test.log(LogStatus.INFO, "I clicked the PIM tab");

		page.Pim();
	    
	}

	@When("^then the Add Employee Tab$")
	public void then_the_Add_Employee_Tab() throws Throwable {
		test = extent.startTest("Verify the Add Employee Tab Works");
		Home page = PageFactory.initElements(driver, Home.class);
		

		page.New(driver);
		test.log(LogStatus.INFO, "I clicked the Add Employee tab");
	   
	}

	@When("^I fill out the Add Employee Details correctly$")
	public void i_fill_out_the_Add_Employee_Details_correctly() throws Throwable {
		test = extent.startTest("Verify I Can fill out the Add Employee Details correctly");
		Details page = PageFactory.initElements(driver, Details.class);

		page.user(driver, action);
		test.log(LogStatus.INFO, "I filled out the Add Employee Details correctly");
	}

	@When("^I choose to create Login Details by clicking the appropriate button$")
	public void i_choose_to_create_Login_Details_by_clicking_the_appropriate_button() throws Throwable {
		test = extent.startTest("Verify I can choose to create Login Details by clicking the appropriate button");
		Details page = PageFactory.initElements(driver, Details.class);

		page.click();
		test.log(LogStatus.INFO, "I choose to create Login Details by clicking the appropriate button");
	}

	@When("^I fill out the Login Details correctly$")
	public void i_fill_out_the_Login_Details_correctly() throws Throwable {
		test = extent.startTest("Verify I can fill out the Login Details correctly");
		Details page = PageFactory.initElements(driver, Details.class);

		page.logins(action);
		test.log(LogStatus.INFO, "I filled out the Login Details correctly");
	}

	@When("^I click the Save button$")
	public void i_click_the_Save_button() throws Throwable {
		test = extent.startTest("Verify I Can click the Save button");
		Details page = PageFactory.initElements(driver, Details.class);

		page.click2();
		test.log(LogStatus.INFO, "I clicked the Save button$");
	}

	@Then("^I can search for the Employee I have just created$")
	public void i_can_search_for_the_Employee_I_have_just_created() throws Throwable {
		test = extent.startTest("Verify I can search for the Employee I have just created");
		List page2 = PageFactory.initElements(driver, List.class);

		page2.search(action);
		test.log(LogStatus.INFO, "I  searched for the Employee I have just created");
	}

	@Then("^select them for inspection$")
	public void select_them_for_inspection() throws Throwable {
		test = extent.startTest("Verify I can select them for inspection");
		List page2 = PageFactory.initElements(driver, List.class);

		page2.search2(action,driver);
		
		WebElement checkElement = driver.findElement(By.id("first_name"));

		assertEquals("Dickie", checkElement.getText());
		test.log(LogStatus.PASS, "I was able to select them for inspection");
	   
	}
	
	@After
	public void tearDown() throws InterruptedException {
				
		Thread.sleep(3000);
		driver.close();
	}
	
	@AfterClass
	public static void tearitall() {
		extent.flush();
	}

}
