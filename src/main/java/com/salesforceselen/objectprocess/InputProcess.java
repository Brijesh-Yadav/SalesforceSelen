package com.salesforceselen.objectprocess;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputProcess extends ElementCheckProcess{

	public InputProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void performInput(ArrayList<String> obj_list, String text,int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, text);
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(mapobj,"False",obj_index,value);
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(mapobj,"False",obj_index,value);
			}
		}
	}
	
	private int execute_with_true_false_condition(LinkedHashMap<String,String> mappedObj,String mapcond, int obj_index,String fieldvalue ){
		int check = 0;
		for (Map.Entry<String, String> entry : mappedObj.entrySet()) {
			check =1;
			String key = entry.getKey();
			String value = entry.getValue();
			if(value.equalsIgnoreCase(mapcond)){
				List<WebElement> elements = returnWebelements(key);
				if(elements.size()>1){
					System.out.println("element size "+elements.size());
					System.out.println("Multiple objects are present on the page for this pattern.."+key);
				}
				if(obj_index==0){
					//iterate all objects and click
					execute_with_zero_index(key,fieldvalue );
					break;
				}else{
					//click on first index
					WebElement element = elements.get(0);
					enter(element, fieldvalue);
					break;
				}
			}
		}
		return check;
	}

	private void execute_with_zero_index(String key, String value){
		System.out.println("Executing with zero index..");
		List<WebElement> elem = returnWebelements(key);
		for(int i=0; i<elem.size(); i++){
			WebElement element = elem.get(i);
			enter(element,value);
			try{
				System.out.println("entered value on "+i+" index");
				static_wait(1);
			}catch(Exception e){}
		}
	}

}
