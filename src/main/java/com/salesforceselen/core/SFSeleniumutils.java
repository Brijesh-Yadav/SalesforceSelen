package com.salesforceselen.core;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SFSeleniumutils implements SFSelenium{
	
	private WebDriver driver;
	
	protected SFSeleniumutils(WebDriver driver){
		this.driver = driver;
	}
	
	public List<WebElement> return_webelements(String xpathObj) {
		System.out.println("Selenium is called..");
		List<WebElement> elements = driver.findElements(By.xpath(xpathObj));
		return elements;
	}

}
