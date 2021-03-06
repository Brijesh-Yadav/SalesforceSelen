package com.salesforceselen.selenium;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface SeleniumWait {
	
	public boolean waitForElementPresent(String xpathobj, int time);
	
	public void waitForElementPresent(ArrayList<String> xpathobj, int time);
	
	public void waitForElementPresent(By by, int time);

	public void waitForElementPresent(WebElement element, int time);
	
	public boolean waitForElementClickable(String xpathobj, int time);

	public void waitForElementClickable(WebElement element, int time);

}
