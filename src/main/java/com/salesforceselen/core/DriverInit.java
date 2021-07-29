package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;
import com.salesforceselen.selenium.Selenium;
import com.salesforceselen.selenium.SeleniumActions;

public class DriverInit implements  SalesforceDriver{
	
	private WebDriver w_driver;
	private String sfversion ;
	
	DriverInit(WebDriver w_driver,String sfversion){
		this.w_driver = w_driver;
		this.sfversion = sfversion;
		System.out.println("driver reference is set..");
	}
	
	public Salesforce salesforce() {
		return new DriverOptions(w_driver,sfversion);
	}

	public Selenium selenium() {
		return new SeleniumActions(w_driver);
	}

}
