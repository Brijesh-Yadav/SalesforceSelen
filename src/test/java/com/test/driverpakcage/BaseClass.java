package com.test.driverpakcage;


public class BaseClass extends Driver{
	
	public void launchApplication(){
		__initializeDriver();
		driver.get("https://brijesh-sl-dev-ed.my.salesforce.com/?ec=302&startURL=%2Fsetup%2FforcecomHomepage.apexp%3Fsetupid%3DForceCom");
		driver.manage().window().maximize();
		System.out.println("navigagted to application");
	}
	
	public void closeApplication(){
		driver.quit();
	}
	

}
