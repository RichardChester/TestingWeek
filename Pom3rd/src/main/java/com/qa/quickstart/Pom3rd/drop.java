package com.qa.quickstart.Pom3rd;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class drop {

	@FindBy(xpath = "//*[@id=\"draggableview\"]/p")
	private WebElement dragb;
	
	@FindBy(id = "droppableview")
	private WebElement target;
	

	
	public void dragging(Actions action) {
		
		 action.dragAndDrop(dragb, target).perform();
		
	}
	
}