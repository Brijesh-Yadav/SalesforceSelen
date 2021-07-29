package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class DriverOptions implements Salesforce{
	
	private WebDriver driver;
	
	public DriverOptions(WebDriver driver,String sfversion){
		this.driver = driver;
		SetGetConfig.sfversion = sfversion;
	}

	public Pattern pattern() {
		// TODO Auto-generated method stub
		return new ObjectDriver(driver);
	}

	public Traverse traverse() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
