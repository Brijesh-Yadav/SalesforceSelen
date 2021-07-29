package com.salesforceselen.unittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.ObjectDriver;
import com.salesforceselen.core.SalesforceDriver;
import com.salesforceselen.core.SalesforceLex;

public class TestScript2 {
	
	public static void main(String []args){
		System.out.println("initializing driver..");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://brijesh-sl-dev-ed.my.salesforce.com/?ec=302&startURL=%2Fsetup%2FforcecomHomepage.apexp%3Fsetupid%3DForceCom");
		driver.manage().window().maximize();
		//initialize Salesforce driver
		SalesforceDriver sdriver = new SalesforceLex(driver);
		ObjectDriver newdriver = sdriver.salesforce().pattern().getObjectDriver();
		newdriver.getObj(Obj.button("Login")).click();
		
//		String [] arr = {"col a","col b"};
//		sdriver.salesforce().pattern().getObj(Obj.table("abcdetf").getCell(arr,"Object")).click();	

		
	}

}
