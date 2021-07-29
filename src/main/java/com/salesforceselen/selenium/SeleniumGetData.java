package com.salesforceselen.selenium;

import org.openqa.selenium.WebElement;

public interface SeleniumGetData {
	
	public String getInnerHtml(WebElement element);

	public String getOuterHtml(WebElement element);

	public String getInnerText(WebElement element);

	public String getText(WebElement element);

}
