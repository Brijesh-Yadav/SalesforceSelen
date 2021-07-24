package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class ActionEvent implements Action{
	
	private WebDriver driver;
	
	ActionEvent(WebDriver driver){
		this.driver = driver;
	}
	
	public WaitClick wait_to_clickable(int timeInSec){
		return new WaitClick(driver);
	}

	public WaitClick wait_to_present(int timeInSec){
		return new WaitClick(driver);
	}

	public void click() {
		// TODO Auto-generated method stub
		
	}

	public void select(String text) {
		// TODO Auto-generated method stub
		
	}

	public void enter(String text) {
		// TODO Auto-generated method stub
		
	}

	public void getElement() {
		// TODO Auto-generated method stub
		
	}
	
}
