package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class ActionEvent {
	
	private WebDriver driver;
	
	ActionEvent(WebDriver driver){
		this.driver = driver;
	}
	
	public void click(){
		
	}
	
	public void select(String text){
		
	}

	public void enter(String text){
		
	}
	
	public void getElement(){
		
	}
	
	public WaitClick wait_to_clickable(int timeInSec){
		
		return new WaitClick(driver);
	}


	
}
