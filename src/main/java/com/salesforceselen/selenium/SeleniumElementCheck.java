package com.salesforceselen.selenium;

import java.util.List;
import org.openqa.selenium.WebElement;

public interface SeleniumElementCheck {
	
	public boolean isClickable(WebElement element);
	
	public boolean isElementPresent(WebElement element);
	
	public boolean isElementPresent(List<WebElement> element);

}
