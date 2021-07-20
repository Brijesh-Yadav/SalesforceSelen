package com.salesforceselen.core;

import org.openqa.selenium.WebDriver;

public class SetDriverRef {
	
	public DriverRef setRef(WebDriver driver){
		DriverRef ref = new DriverRef();
		ref.setDriver(driver);
		return ref;
	}

}
