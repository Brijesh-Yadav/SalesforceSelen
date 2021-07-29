package com.salesforceselen.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

public interface SeleniumActionBuilder {
	
	public void action_builder_click(WebElement element);

	public Action move_to_element(WebElement element);


}
