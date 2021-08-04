package com.salesforceselen.core;

import org.openqa.selenium.WebElement;

public interface Action {
	
	public void click();
	
	public SelectOptions select(String text);

	public void enter(String text);
	
	public WebElement getElement();
	
	public WaitClick wait_to_clickable(int timeInSec);

	public WaitClick wait_to_present(int timeInSec);

}
