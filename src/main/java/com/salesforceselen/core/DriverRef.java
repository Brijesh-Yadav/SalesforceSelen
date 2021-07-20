package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class DriverRef {
	
	private WebDriver driver;
	
	public void setDriver(WebDriver driver){
		this.driver = driver;
	}
	
	public WebDriver gettDriver(){
		return this.driver;
	}

}
