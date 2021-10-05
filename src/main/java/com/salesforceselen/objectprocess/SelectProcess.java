package com.salesforceselen.objectprocess;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.salesforceselen.core.ObjNameEnum;

public class SelectProcess extends ElementCheckProcess{

	public SelectProcess(WebDriver driver) {
		super(driver);
	}
	
	private int execute_with_true_false_condition(ObjNameEnum val,LinkedHashMap<String,String> mappedObj,String mapcond, int obj_index,String fieldvalue ){
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
					execute_with_zero_index(val,key,fieldvalue );
					break;
				}else{
					WebElement element = elements.get(0);
					execute_with_first_index(element, val, value);
					break;
				}
			}
		}
		return check;
	}

	private void execute_with_zero_index(ObjNameEnum val,String key, String value){
		System.out.println("Executing with zero index..");
		List<WebElement> elem = returnWebelements(key);
		for(int i=0; i<elem.size(); i++){
			WebElement element = elem.get(i);
			switch(val.toString()){
			case "DROPDOWN":
				System.out.println("DROPDOWN");
				selectDropdownValue(element, value);
				System.out.println("entered value on "+i+" index");
				static_wait(1);
			case "DROPDOWN_CLICK":
				System.out.println("DROPDOWN_CLICK");
			case "DROPDOWN_TYPE":
				System.out.println("DROPDOWN_TYPE");
			case "DROPDOWN_KEYS":
				System.out.println("DROPDOWN_KEYS");
			case "DROPDOWN_MULTIPLE":
				System.out.println("DROPDOWN_MULTIPLE");
			}
		}
	}

	private void execute_with_first_index(WebElement element, ObjNameEnum val, String value){
		switch(val.toString()){
		case "DROPDOWN":
			System.out.println("DROPDOWN");
			selectDropdownValue(element, value);
		case "DROPDOWN_CLICK":
			System.out.println("DROPDOWN_CLICK");
			click(element);
			static_wait(2);
			
		case "DROPDOWN_TYPE":
			System.out.println("DROPDOWN_TYPE");
		case "DROPDOWN_KEYS":
			System.out.println("DROPDOWN_KEYS");
		case "DROPDOWN_MULTIPLE":
			System.out.println("DROPDOWN_MULTIPLE");
		}
	}

	
	public void selectDropdown(ArrayList<String> obj_list,String obj_name, int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, obj_name);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(ObjNameEnum.DROPDOWN, mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(ObjNameEnum.DROPDOWN,mapobj,"False",obj_index,value);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(ObjNameEnum.DROPDOWN,mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(ObjNameEnum.DROPDOWN,mapobj,"False",obj_index,value);
			}
		}
	}
	
	public void selectDropdown_click(LinkedHashMap<String,String> obj_list,String obj_name,  int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, obj_name);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_CLICK,mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(ObjNameEnum.DROPDOWN_CLICK,mapobj,"False",obj_index,value);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_CLICK,mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(ObjNameEnum.DROPDOWN_CLICK,mapobj,"False",obj_index,value);
			}
		}
	}
	
	public void selectDropdown_type(LinkedHashMap<String,String> obj_list, String obj_name, int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, obj_name);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_TYPE,mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(ObjNameEnum.DROPDOWN_TYPE,mapobj,"False",obj_index,value);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_TYPE,mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(ObjNameEnum.DROPDOWN_TYPE,mapobj,"False",obj_index,value);
			}
		}
	}
	
	public void selectDropdown_keys(LinkedHashMap<String,String> obj_list,String obj_name,  int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, obj_name);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_KEYS,mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(ObjNameEnum.DROPDOWN_KEYS,mapobj,"False",obj_index,value);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_KEYS,mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(ObjNameEnum.DROPDOWN_KEYS,mapobj,"False",obj_index,value);
			}
		}
	}
	
	public void select_multipleDropdown(ArrayList<String> obj_list, String obj_name, int obj_index,String value){
		LinkedHashMap<String,String> obj_list_att = process_object_evaluation_with_containsAttribute(obj_list, obj_name);
		//execute contains attribute true set value
		LinkedHashMap<String,String> mapobj = process_object_evaluation_with_clickable(obj_list_att,"True");
		int check = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_MULTIPLE,mapobj,"True",obj_index,value);
		if(check!=1){
			execute_with_true_false_condition(ObjNameEnum.DROPDOWN_MULTIPLE,mapobj,"False",obj_index,value);
			//execute contains attribute false set value
			LinkedHashMap<String,String> mapobj2 = process_object_evaluation_with_clickable(mapobj,"False");
			int check2 = execute_with_true_false_condition(ObjNameEnum.DROPDOWN_MULTIPLE,mapobj2,"True",obj_index,value);
			if(check2!=1){
				execute_with_true_false_condition(ObjNameEnum.DROPDOWN_MULTIPLE,mapobj,"False",obj_index,value);
			}
		}
	}

}
