package com.salesforceselen.unittest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.SalesforceDriver;
import com.salesforceselen.core.SalesforceLex;

public class ExecutionDesign {
	
	public static void main(String []args){
		System.out.println("initializing driver..");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/driver/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Initialize browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://brijesh-sl-dev-ed.my.salesforce.com/?ec=302&startURL=%2Fsetup%2FforcecomHomepage.apexp%3Fsetupid%3DForceCom");
		//initialize Salesforce driver
		SalesforceLex sdriver = new SalesforceLex(driver);
		
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).click();
		sdriver.salesforce().pattern().getObj(Obj.textfield("account name")).enter("test123");
		sdriver.salesforce().pattern().getObj(Obj.dropdown("Login")).select("text");
		sdriver.salesforce().pattern().getObj(Obj.textfield("account name")).enter("test123");
		sdriver.salesforce().pattern().getObj(Obj.lightning_dropdown_("")).select("");
		sdriver.salesforce().pattern().verify().text("");
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).wait_to_clickable(30).click();		
		sdriver.salesforce().pattern().getObj(Obj.table("").getCell(2,4));
		String [] arr = {"ab","as"};
		sdriver.salesforce().pattern().getObj(Obj.table("abcdetf").getCell(arr,"Object")).click();	
		
	}

}
