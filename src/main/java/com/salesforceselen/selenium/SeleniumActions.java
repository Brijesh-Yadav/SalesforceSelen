package com.salesforceselen.selenium;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

public class SeleniumActions implements Selenium{
	
	private WebDriver driver;
	
	public SeleniumActions(WebDriver driver){
		this.driver = driver;
	}

	@Override
	public List<WebElement> returnWebelements(String xpathObj) {
		List<WebElement> elements = driver.findElements(By.xpath(xpathObj));
		return elements;
	}

	@Override
	public boolean isClickable(WebElement element) {
		if(element.isDisplayed() && element.isEnabled()){
			return true;
		}
		return false;
	}

	@Override
	public boolean isElementPresent(WebElement element) {
		if(element.isDisplayed()){
			return true;
		}
		return false;
	}

	public boolean isElementPresent(List<WebElement> element) {
		if(element.size()>0){
			return true;
		}
		return false;
	}

	public void js_click(WebElement element) {
		try {
			JavascriptExecutor jsobj = (JavascriptExecutor) driver;
			jsobj.executeScript("arguments[0].click();", element);
			System.out.println("clicked on element using javascript");
		} catch (Exception e) {
			System.out.println("__js_click error occured... " + e.getMessage());
			element.sendKeys(Keys.ENTER);
			System.out.println("Pressed entered.. keyoboard button");
		}
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
		System.out.println("total wait time "+time+" sec");
		try{
			for(int i=0; i<=time; i++){
				System.out.println("waiting.."+i+" sec");
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println("__staticWait - ignore messages ");
		}
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
		try{
			element.click();
		}catch(JavascriptException e){
			System.out.println("under JavascriptException __click ");
			js_click(element);
		}catch(ElementClickInterceptedException e){
			System.out.println("under ElementClickInterceptedException __click ");
			try{
				action_builder_click(element);
			}catch(Exception f){
				System.out.println("under Exception __click ");
				js_click(element);
			}
		}catch(ElementNotInteractableException e){
			System.out.println("under ElementNotInteractableException __click ");
			js_click(element);
		}catch(StaleElementReferenceException e){
			System.out.println("under StaleElementReferenceException __click ");
			js_click(element);
		}
	}

	public void js_waitToLoadpage(int time) {
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

	@Override
	public String getInnerText(WebElement element) {
		String attribute = element.getAttribute("innerText");
		return attribute;
	}

	@Override
	public void mouse_hover(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action_builder_click(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void js_scroll_down(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void js_scroll_up(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void js_scroll_to_element_view(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void js_scroll_to_bottom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Action move_to_element(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enter(WebElement element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getText(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

}
