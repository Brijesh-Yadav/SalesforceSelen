package com.salesforceselen.objectprocess;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.salesforce.exception.ObjectNotFoundException;
import com.salesforceselen.selenium.Seleniumutils;

public class ElementCheckProcess extends Seleniumutils{
	
	private WebDriver driver;
	
	public ElementCheckProcess(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * it will check element presence in browser and store it in Arraylist
	 */
	public ArrayList<String> store_present_element(ArrayList<String> oblist){
		System.out.println("property list size "+oblist.size());
		ArrayList<String> obj_list =  new ArrayList<String>();
		int result = 0;
		for(int i=0; i<oblist.size(); i++){
			String xpathobj = oblist.get(i);
			System.out.println("xpath obj "+xpathobj);
			List<WebElement> list = returnWebelements(xpathobj);
			if(list.size()>0){
				result = 1;
				System.out.println(xpathobj+" element is present!!");
				obj_list.add(xpathobj);
			}
		}
		if(result!=1){
			printlist(oblist);
			throw new ObjectNotFoundException("none of the element is found from above pattern..");
		}
		check_multiple_pattern(obj_list);
		return obj_list;
	}
	
	public void printlist(ArrayList<String> list){
		for(int i=0; i<list.size(); i++){
			String data = list.get(i);
			System.out.println("Pattern :: "+data);
		}
	}
	
	public void check_multiple_pattern(ArrayList<String> presentlist){
		if(presentlist.size() >1){
			System.out.println("muliple html strucure pattern are present on the page for the same label text...");
			System.out.println("It may not work.. try to use indexing from above printed pattern..");
		}
	}
	
	public void check_multiple_object(ArrayList<String> elements){
		if(elements.size() >1){
			System.out.println("element size "+elements.size());
			System.out.println("Multiple objects are present on the page");
		}
	}
	

	public LinkedHashMap<String,String>process_object_evaluation_2_with_attribute(ArrayList<String> arraylist, String text){
		LinkedHashMap<String,String> mapobj = new LinkedHashMap<String,String>();
		for(int i=0; i<arraylist.size(); i++){
			String xpath_obj = arraylist.get(i);
			try{
				WebElement element = returnWebElement(xpath_obj);
				boolean result  = containsAttribute(element, text);
				System.out.println("Element contains attribute state :: "+result);
				if(result){
					System.out.println("Element contains attribute and its added in object list.. "+xpath_obj);
					mapobj.put(xpath_obj, "True");
				}else{
					mapobj.put(xpath_obj, "False");
				}
			}catch(TimeoutException et){
				mapobj.put(xpath_obj, "False");
			}
		}
		return mapobj;
	}

	
	
}
