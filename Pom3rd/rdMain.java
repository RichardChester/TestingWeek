package com.qa.quickstart.Pom3rd;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class rdMain {
	
	WebDriver driver = null;
	Actions action =null;
	static ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\noodle\\noodle.html", true);

	ExtentTest test;


	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Development\\\\chromedriver.exe");
		driver = new ChromeDriver();
		
	action = new Actions(driver);

			
			

	}
	

	@Test 
	public void dropTest() {
		
		test = extent.startTest("Verify drag & drop");
		
		driver.get("http://demoqa.com/");

		home page = PageFactory.initElements(driver, home.class);

		page.dropTest();
		
		drop page1 = PageFactory.initElements(driver, drop.class);

		page1.dragging(action);
								
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"droppableview\"]/p"));

		assertEquals("Dropped!", checkElement.getText());
		
		test.log(LogStatus.PASS, "dropTest passed");
	}
	
	@Test 
	public void selecting() {
		
		test = extent.startTest("Verify selecting");
		
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.selectTest();

		select page = PageFactory.initElements(driver, select.class);

		page.cycle();
												
		assertTrue("", page.checkCycle());
		
		test.log(LogStatus.PASS, "selecting passed");
	}
	
	@Test 
	public void acordian() {
		
		test = extent.startTest("Verify acordian");		
		
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.acordianTest();

		accordian page = PageFactory.initElements(driver, accordian.class);

		page.acord();
													
		assertTrue("", page.checkacord());
		
		test.log(LogStatus.PASS, "acordian passed");
	}
	
	@Test 
	public void autocomp() {
		
		test = extent.startTest("Verify autocomp");
		
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.comptest();

		autocomp page = PageFactory.initElements(driver, autocomp.class);

		page.comping(action,driver);
		
		test.log(LogStatus.PASS, "autocomp passed");
	}
	
	@Test 
	public void datepicker() {
		
		test = extent.startTest("Verify datepicker");
		
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.datetest();

		datepick page = PageFactory.initElements(driver, datepick.class);

		page.pick();
		
		test.log(LogStatus.PASS, "datepicker passed");
	}
	
	@Test 
	public void menus() {
		
		test = extent.startTest("Verify menus");
		
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.menutest();

		menu page = PageFactory.initElements(driver, menu.class);

		page.hover(action);
		
		test.log(LogStatus.PASS, "menus passed");
	}
	
	@Test 
	public void slide() {
		
		test = extent.startTest("Verify slide");
				
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.slidetest();

		slider page = PageFactory.initElements(driver, slider.class);

		page.slide();
		
		test.log(LogStatus.PASS, "slide passed");
	}
	
	@Test 
	public void tabs() {
		
		test = extent.startTest("Verify tabs");
				
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.tabtest();

		tabs page = PageFactory.initElements(driver, tabs.class);

		page.tab();
		
		assertTrue("", page.checktab());
		
		test.log(LogStatus.PASS, "tabs passed");
	}
	
	@Test 
	public void tools() {
		
		test = extent.startTest("Verify tools");
				
		driver.get("http://demoqa.com/");
		
		home page1 = PageFactory.initElements(driver, home.class);

		page1.tooltest();

		tool page = PageFactory.initElements(driver, tool.class);

		page.tooly();
		
		test.log(LogStatus.PASS, "tools passed");
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