package com.salesforceselen.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public interface SeleniumKeyboardEvent {
	
	public void press_keys_selenium(WebElement element, Keys key);
	
	public void press_keyboard_key(int key);


}
