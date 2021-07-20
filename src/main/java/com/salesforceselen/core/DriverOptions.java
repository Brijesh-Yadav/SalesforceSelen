package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class DriverOptions implements Salesforce{
	
	private WebDriver driver;
	
	public DriverOptions(WebDriver driver){
		this.driver = driver;
	}

	public Pattern pattern() {
		// TODO Auto-generated method stub
		return new ElementObject(driver);
	}

	public Traverse traverse() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
