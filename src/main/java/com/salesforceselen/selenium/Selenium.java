package com.salesforceselen.selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface Selenium {
	
	public List<WebElement> returnWebelements(String xpathObj);
	
	public boolean isClickable(WebElement element);
	
	public boolean isElementPresent(WebElement element);
	
	public boolean isElementPresent(List<WebElement> element);
	
	public void click(WebElement element);
	
	public void js_click(WebElement element);
	
	public void js_enter(WebElement element, String text);
	
	public void js_enter_chr_by_chr(WebElement element, String text);
	
	public boolean js_isDisabled(WebElement element);
	
	public boolean js_isReadonly(WebElement element);
	
	public void js_setAttribute(WebElement element,String attName, String attValue);
	
	public void js_waittooadpage(int time);
	
	public void mouse_click(WebElement element);
	
	public void press_keys_selenium(WebElement element, Keys key);
	
	public void press_keyboard_key(int key);
	
	public WebElement returnWebElement(String xpathObj);
	
	public WebElement returnWebElement(By by);
	
	public void selectDropdownValue(WebElement element,String value);
	
	public void static_wait(int time);
	
	public void switchBackToDefault();
	
	public void waitForElementPresent(String xpathobj, int time);
	
	public void waitForElementPresent(ArrayList<String> xpathobj, int time);
	
	public void waitForElementPresent(By by, int time);

	public void waitForElementPresent(WebElement element, int time);
	
	public void waitForElementClickable(String xpathobj, int time);

	public void waitForElementClickable(WebElement element, int time);
	
	public void selectWindow(WebElement element);
	
	public boolean containsAttribute(WebElement element, String att);
	
	public boolean containsAttribute(WebElement element, String [] att);
	
	public String getInnerHtml(WebElement element);

	public String getOuterHtml(WebElement element);

	public String getInnerText(WebElement element);

}
