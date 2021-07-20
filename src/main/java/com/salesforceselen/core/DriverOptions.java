package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class DriverOptions implements Salesforce{
	
	private WebDriver driver;
	
	public DriverOptions(WebDriver driver){
		this.driver = driver;
	}

	public Pattern pattern() {
		// TODO Auto-generated method stub
		SetDriverRef rf = new SetDriverRef();
		DriverRef ref = rf.setRef(driver);//set driver reference
		ElementObject eo = new ElementObject();
		eo.setDriverRef(ref);
		return new ElementObject();
	}

	public Traverse traverse() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
