package com.salesforceselen.selenium;

import org.openqa.selenium.WebElement;

public interface SeleniumJavaScript {
	
	public void js_click(WebElement element);
	
	public void js_enter(WebElement element, String text);
	
	public void js_enter_chr_by_chr(WebElement element, String text);
	
	public boolean js_isDisabled(WebElement element);
	
	public boolean js_isReadonly(WebElement element);
	
	public void js_setAttribute(WebElement element,String attName, String attValue);
	
	public void js_wait_to_load_HTML_Page(int time);
	
	public void js_scroll_down(int num);
	
	public void js_scroll_up(int num);
	
	public void js_scroll_to_element_view(WebElement element);

	public void js_scroll_to_bottom();


}
