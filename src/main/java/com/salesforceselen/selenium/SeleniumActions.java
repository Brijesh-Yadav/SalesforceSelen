package com.salesforceselen.selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumActions implements Selenium{
	
	private WebDriver driver;
	
	public SeleniumActions(WebDriver driver){
		this.driver = driver;
	}
	
	public List<WebElement> returnWebelements(String xpathObj) {
		List<WebElement> elements = driver.findElements(By.xpath(xpathObj));
		return elements;
	}

	public boolean isClickable(WebElement element) {
		if(element.isDisplayed()==true && element.isEnabled()==true){
			return true;
		}
		return false;
	}

	public boolean isElementPresent(WebElement element) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isElementPresent(List<WebElement> element) {
		// TODO Auto-generated method stub
		return false;
	}

	public void js_click(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	public void js_enter(WebElement element, String text) {
		// TODO Auto-generated method stub
		
	}

	public void js_enter_chr_by_chr(WebElement element, String text) {
		// TODO Auto-generated method stub
		
	}

	public boolean js_isDisabled(WebElement element) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean js_isReadonly(WebElement element) {
		// TODO Auto-generated method stub
		return false;
	}

	public void js_setAttribute(WebElement element, String attName, String attValue) {
		// TODO Auto-generated method stub
		
	}

	public void mouse_click(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	public void press_keys_selenium(WebElement element, Keys key) {
		// TODO Auto-generated method stub
		
	}

	public void press_keyboard_key(int key) {
		// TODO Auto-generated method stub
		
	}

	public void selectDropdownValue(WebElement element, String value) {
		// TODO Auto-generated method stub
		
	}

	public void static_wait(int time) {
		// TODO Auto-generated method stub
		
	}

	public void switchBackToDefault() {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementPresent(String xpathobj, int time) {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementPresent(ArrayList<String> xpathobj, int time) {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementPresent(By by, int time) {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementPresent(WebElement element, int time) {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementClickable(String xpathobj, int time) {
		// TODO Auto-generated method stub
		
	}

	public void waitForElementClickable(WebElement element, int time) {
		// TODO Auto-generated method stub
		
	}

	public WebElement returnWebElement(String xpathObj) {
		WebElement element = driver.findElement(By.xpath(xpathObj));
		return element;
	}

	public WebElement returnWebElement(By by) {
		WebElement element = driver.findElement(by);
		return element;
	}

	public void click(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	public void js_waittooadpage(int time) {
		// TODO Auto-generated method stub
		
	}

	public void selectWindow(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	public boolean containsAttribute(WebElement element, String att) {
		String attribute = getOuterHtml(element);
		if(attribute.contains(att)){
			System.out.println("attribute "+attribute);
			return true;
		}
		return false;
	}

	public boolean containsAttribute(WebElement element, String[] att) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getInnerHtml(WebElement element) {
		String attribute = element.getAttribute("innerHTML");
		return attribute;
	}

	public String getOuterHtml(WebElement element) {
		String attribute = element.getAttribute("outerHTML");
		return attribute;
	}

	public String getInnerText(WebElement element) {
		String attribute = element.getAttribute("innerText");
		return attribute;
	}

	public void mouse_hover(WebElement element) {
		// TODO Auto-generated method stub
		
	}

}
