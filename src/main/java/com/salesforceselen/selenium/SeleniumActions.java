package com.salesforceselen.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.salesforceselen.helpers.DateTime_;
import com.salesforceselen.helpers.Number_;

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

	@Override
	public boolean isElementPresent(List<WebElement> element) {
		if(element.size()>0){
			return true;
		}
		return false;
	}

	@Override
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

	@Override
	public void js_enter(WebElement element, String text) {
		try{
			JavascriptExecutor jsobj = (JavascriptExecutor)driver;
			jsobj.executeScript("arguments[0].innerHTML= '"+text+"'", element);
		}catch(JavascriptException e){
			System.out.println("JavascriptException js_enter error "+e.getMessage());
		}
	}

	@Override
	public void js_enter_chr_by_chr(WebElement element, String text) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", text);
		Random r = new Random();
		for (int i = 0; i < text.length(); i++) {
			try {
				Thread.sleep((int) (r.nextGaussian() * 15 + 100));
			} catch (Exception e1) {
			}
			char c = text.charAt(i);
			String s = new StringBuilder().append(c).toString();
			element.sendKeys(s);
		}
	}

	@Override
	public boolean js_isDisabled(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean disabled = (Boolean) js.executeScript("return arguments[0].hasAttribute(\"disabled\");", element);
		return disabled;
	}

	@Override
	public boolean js_isReadonly(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		boolean disabled = (Boolean) js.executeScript("return arguments[0].hasAttribute(\"readOnly\");", element);
		return disabled;
	}

	@Override
	public void js_setAttribute(WebElement element, String attName, String attValue) {
		try{
			JavascriptExecutor jsobj = (JavascriptExecutor)driver;
			jsobj.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", 
	                element, attName, attValue);
		}catch(Exception e){
			System.out.println("__js_setAttribute error "+e.getMessage());
		}
	}

	@Override
	public void mouse_click(WebElement element) {
		Actions builder = new Actions(driver);
        Action mouseclick = builder.moveToElement(element).click().build();
        mouseclick.perform();        
	}

	@Override
	public void press_keys_selenium(WebElement element, Keys keys) {
		element.sendKeys(keys);
	}

	@Override
	public void press_keyboard_key(int key) {
		try {
			// key codes
			// https://docstore.mik.ua/orelly/webprog/DHTML_javascript/0596004672_jvdhtmlckbk-app-b.html
			// key.Event.VK_Enter
			// 13 for Enter
			Robot robot = new Robot();
			robot.keyPress(key);
			robot.keyRelease(key);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void selectDropdownValue(WebElement element, String value) {
		Select select = new Select(element);
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println("default selected item "+defaultItem);
		if(defaultItem.trim().equalsIgnoreCase(value.trim())){
			System.out.println(value+" is already selected");
		}else{
			select.selectByVisibleText(value.trim());
			System.out.println(value+" is selected");
		}
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
		driver.switchTo().defaultContent();
	}

	public boolean waitForElementPresent(String xpathobj, int time) {
		int res = 0;
		for(int j=1; j<=time; j++){
			List<WebElement> element = returnWebelements(xpathobj);
			if(element.size()>0){
				res = 1;
				System.out.println("element is present");
				return true;
			}else{
				static_wait(1);
				System.out.println("waiting for element to present.."+xpathobj+" :: "+j+" sec");
			}
		}
		if(res!=1){
			System.out.println("element is not found..");
		}
		return false;
	}

	public void waitForElementPresent(ArrayList<String> xpathobj, int time) {
		for(int i=0; i<xpathobj.size(); i++){
			String xpath_obj = xpathobj.get(i);
			int res = 0;
			for(int j=1; j<=time; j++){
				List<WebElement> elesize = returnWebelements(xpath_obj);
				if(elesize.size()>0){
					res = 1;
					System.out.println(xpath_obj+" element is present");
					break;
				}else{
					static_wait(1);
					System.out.println("waiting for element to present.."+j+" sec");
				}
			}
			if(res!=1){
				System.out.println(xpath_obj+" element is not found..");
			}
		}
	}

	public void waitForElementPresent(By by, int time) {
		WebDriverWait wait  = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		System.out.println("element is present now.");
	}

	public void waitForElementPresent(WebElement element, int time) {
		WebDriverWait wait  = new WebDriverWait(driver,time);
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
		System.out.println("element is present now.");
	}

	public boolean waitForElementClickable(String xpathobj, int time) {
		int res = 0;
		for(int i=1; i<=time; i++){
			WebElement element = returnWebElement(xpathobj);
			try{
				boolean pres = isClickable(element);
				if(pres==true){
					res = 1;
					System.out.println("Element is clickable.. "+xpathobj);
					return true;
				}
				Thread.sleep(1000);
				System.out.println("Waiting for element to be clickable.. "+i+" sec ");
			}catch(Exception e){}
		}
		if(res!=1){
			System.out.println("Element is not clickable.. "+xpathobj);
		}
		return false;
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

	@Override
	public void click_all_element(List<WebElement> element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DateTime_ dateTime(){
		return new DateTime_();
	}
	
	@Override
	public Number_ number(){
		return new Number_();
	}


}
