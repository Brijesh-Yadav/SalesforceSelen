package com.salesforceselen.objectprocess;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.salesforce.exception.ObjectNotFound;
import com.salesforceselen.core.SFSeleniumutils;

public class ElementCheckProcess extends SFSeleniumutils{
	
	private WebDriver driver;
	
	public ElementCheckProcess(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * it will check element presence in browser and store it in Arraylist
	 */
	public ArrayList<String> store_present_element(ArrayList<String> oblist){
		System.out.println("Element presence is called..");
		System.out.println("property list size "+oblist.size());
		ArrayList<String> obj_list =  new ArrayList<String>();
		int result = 0;
		for(int i=0; i<oblist.size(); i++){
			String xpathobj = oblist.get(i);
			System.out.println("xpath obj "+xpathobj);
			List<WebElement> list = return_webelements(xpathobj);
			if(list.size()>0){
				result = 1;
				System.out.println(xpathobj+" element is present!!");
				obj_list.add(xpathobj);
			}
		}
		if(result!=1){
			printlist(oblist);
			throw new ObjectNotFound("none of the element is found from above pattern..");
		}
		return obj_list;
	}
	
	public void printlist(ArrayList<String> list){
		for(int i=0; i<list.size(); i++){
			String data = list.get(i);
			System.out.println("Pattern :: "+data);
		}
	}
	
	

}
