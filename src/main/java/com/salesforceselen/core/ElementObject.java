package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.salesforceselen.core.Salesforce.Pattern;
import com.salesforceselen.objectprocess.ElementCheckProcess;

public class ElementObject implements Pattern{
	
	private WebDriver driver;
	
	protected ElementObject(WebDriver driver){
		this.driver = driver;
	}
	
	public ActionEvent getObj(ArrayList<String> obj) {
		System.out.println("get object is called..");
		ElementCheckProcess ec = new ElementCheckProcess(driver);
		ec.store_present_element(obj);
		// TODO Auto-generated method stub
		return new ActionEvent(driver);
	}

	public SelectEvent getObj(LinkedHashMap<String, String> obj) {
		// TODO Auto-generated method stub
		return new SelectEvent(driver);
	}

	public Verify verify() {
		// TODO Auto-generated method stub
		return new ExecuteVerification(driver);
	}

}
