package com.salesforceselen.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public interface SeleniumActionBuilder {
	
	public void action_builder_click(WebElement element);

	public Actions move_to_element(WebElement element);
	
	public void drag_and_drop(WebElement source,WebElement target);


}
