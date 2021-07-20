package com.salesforceselen.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Seleniumutils implements Selenium{
	
	private WebDriver driver;
	
	public Seleniumutils(WebDriver driver){
		this.driver = driver;
	}
	
	public List<WebElement> return_webelements(String xpathObj) {
		System.out.println(xpathObj);
		List<WebElement> elements = driver.findElements(By.xpath(xpathObj));
		return elements;
	}

}
