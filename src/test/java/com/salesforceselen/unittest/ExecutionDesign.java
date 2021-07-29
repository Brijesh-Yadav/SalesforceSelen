package com.salesforceselen.unittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.salesforceselen.core.Attribute;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.ObjectDriver;
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
		
		SalesforceDriver ddriver = new SalesforceLex(driver);
		SalesforceLex sdriver = new SalesforceLex(driver);
		
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).click();
		
		sdriver.salesforce().pattern().getObj(Obj.textfield("Username")).enter("test123");
		
		sdriver.salesforce().pattern().getObj(Obj.dropdown("Login")).select("text");
		sdriver.salesforce().pattern().getObj(Obj.textfield("account name")).enter("test123");
		sdriver.salesforce().pattern().getObj(Obj.lightning_dropdown_click("")).select("");
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).wait_to_clickable(30).click();		
		sdriver.salesforce().pattern().getObj(Obj.table("").getCell(2,4));
		
		String [] arr = {"ab","as"};
		sdriver.salesforce().pattern().getObj(Obj.table("abcdetf").getCell(arr,"Object")).click();	
		
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).wait_to_present(30).click();		
		sdriver.salesforce().pattern().getObj(Obj.button("Login")).getElement();
		sdriver.salesforce().pattern().getObj(Obj.table("").getCell(1, 2)).enter("");
		String [] attribute = {Attribute.id("Login"),Attribute.Class("login")};
		sdriver.salesforce().pattern().getObj(Obj.button("Login", attribute)).click();
		
		ObjectDriver ob = sdriver.salesforce().pattern().getObjectDriver();
		ob.getObj(Obj.button("Login")).click();
		ob.getObj(Obj.dropdown("account",  attribute)).select("Market");
		ob.getObj(Obj.dropdown("account",  attribute)).select("Market").isSelected();
		
		
		
	}

}
