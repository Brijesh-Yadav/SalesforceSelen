package com.salesforceselen.core;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFSeleniumutils implements SFSelenium{
	
	private DriverRef sldref;
	
	public void set_slndriverref(DriverRef ref){
		this.sldref = ref;
		if(sldref.gettDriver()!=null){
			System.out.println("selenium utils driver object reference is set... under SFSeleniumutils class..");
		}
		System.out.println(sldref.gettDriver().getCurrentUrl());
	}
	
	public List<WebElement> return_webelements(String xpathObj) {
		System.out.println("Selenium is called..");
		List<WebElement> elements = sldref.gettDriver().findElements(By.xpath(xpathObj));
		return elements;
	}

}
