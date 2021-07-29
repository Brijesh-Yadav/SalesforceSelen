package com.salesforceselen.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface Selenium extends SeleniumJavaScript, SeleniumMouseEvent,SeleniumWait,
	SeleniumActionBuilder,SeleniumKeyboardEvent,SeleniumElementCheck,SeleniumGetData{
	
	public List<WebElement> returnWebelements(String xpathObj);
	
	public void click(WebElement element);
	
	public WebElement returnWebElement(String xpathObj);
	
	public WebElement returnWebElement(By by);
	
	public void selectDropdownValue(WebElement element,String value);
	
	public void static_wait(int time);
	
	public void switchBackToDefault();
	
	public void selectWindow(WebElement element);
	
	public boolean containsAttribute(WebElement element, String att);
	
	public boolean containsAttribute(WebElement element, String [] att);
	
	public void enter(WebElement element);

}
