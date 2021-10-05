package com.modularactions;

import org.openqa.selenium.WebDriver;
import com.salesforceselen.core.Obj;
import com.salesforceselen.core.ObjectDriver;
import com.salesforceselen.core.SalesforceDriver;
import com.salesforceselen.core.SalesforceLex;

public class Global{
	
	private WebDriver driver;
	private ObjectDriver sfdriver;
	
	public Global(WebDriver driver){
		this.driver = driver;
	}
	
	public ObjectDriver getSfDriver(){
		SalesforceDriver sdriver = new SalesforceLex(driver);
		sfdriver = sdriver.salesforce().pattern().getObjectDriver();
		return sfdriver;
	}
	
	public void loginIntoApplication(){
		System.out.println(driver.getCurrentUrl());
		SalesforceDriver ddriver = new SalesforceLex(driver);
		ddriver.salesforce().pattern().getObj(Obj.textfield("Username")).enter("brijesh9971@gmail.com");
		ddriver.salesforce().pattern().getObj(Obj.textfield("Password")).enter("Anjli@1989B");
		ddriver.salesforce().pattern().getObj(Obj.button("Login",1,3)).click();
	}
	
	public void loginIntoApplication2(){
		sfdriver.getObj(Obj.textfield("Username")).enter("brijesh9971@gmail.com");
		sfdriver.getObj(Obj.textfield("Password")).enter("Anjli@1989B");
		sfdriver.getObj(Obj.button("Login",1,3)).click();
	}
	
}
