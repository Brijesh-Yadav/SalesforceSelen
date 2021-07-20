package com.salesforceselen.core;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface SFSelenium {
	List<WebElement> return_webelements(String xpathObj);
}
