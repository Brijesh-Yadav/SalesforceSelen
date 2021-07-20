package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;
import com.salesforceselen.datetime.DatetimeUtils;
import com.salesforceselen.excel.Excel;
import com.salesforceselen.selenium.Selenium;
import com.salesforceselen.selenium.Seleniumutils;

public class DriverInit implements  SalesforceDriver{
	
	private WebDriver w_driver;
	
	DriverInit(WebDriver w_driver){
		this.w_driver = w_driver;
		System.out.println("driver reference is set..");
	}
	
	public Salesforce salesforce() {
		return new DriverOptions(w_driver);
	}

	public Selenium selenium() {
		return new Seleniumutils(w_driver);
	}

	public DatetimeUtils date() {
		return null;
	}

	public Excel excel() {
		return null;
	}

}
