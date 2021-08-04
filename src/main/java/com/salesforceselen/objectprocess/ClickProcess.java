package com.salesforceselen.objectprocess;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClickProcess extends ElementCheckProcess{

	private WebDriver driver;
	
	public ClickProcess(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private int execute_with_true_false_condition(LinkedHashMap<String,String> mappedObj, String mapcond, int obj_index ){
		int check = 0;
		for (Map.Entry<String, String> entry : mappedObj.entrySet()) {
			check =1;
			String key = entry.getKey();
			String value = entry.getValue();
			if(value.equalsIgnoreCase(mapcond)){
				List<WebElement> elements = driver.findElements(By.xpath(key));
				if(elements.size()>1){
					System.out.println("element size "+elements.size());
					System.out.println("Multiple objects are present on the page for this pattern.."+key);
				}
				if(obj_index==0){
					//iterate all objects and click
					execute_with_zero_index(key);
					break;
				}else{
					//click on first index
					WebElement element = elements.get(0);
					sf_click_condition(element);
					break;
				}
			}
		}
		return check;
	}
	
	private void sf_click_condition(WebElement element){
		String tagname = element.getTagName();
		if("button".equalsIgnoreCase(tagname)){
			for(int i=1; i<15; i++){
				boolean st = js_isDisabled(element);
				if(st==false){
					System.out.println("button is enabled..");
					click(element);
					break;
				}else{
					System.out.println("button is disabled.. waiting to button get enabled..");
					static_wait(1);
				}	
			}
		}else{
			click(element);
		}
	}
	
	private void execute_with_zero_index(String key){
		System.out.println("Executing with zero index..");
		List<WebElement> elem = returnWebelements(key);
		for(int i=0; i<elem.size(); i++){
			WebElement element = elem.get(i);
			try{
				System.out.println("clicked on "+i+" index");
				sf_click_condition(element);
				static_wait(1);
			}catch(Exception e){}
		}
	}
	
	public void performClick(ArrayList<String> obj_list, String text,int obj_index){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, text);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(mapobj,"True",obj_index);
		if(check!=1){
			execute_with_true_false_condition(mapobj,"False",obj_index);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(mapobj2,"True",obj_index);
			if(check2!=1){
				execute_with_true_false_condition(mapobj,"False",obj_index);
			}
		}
	}

}
