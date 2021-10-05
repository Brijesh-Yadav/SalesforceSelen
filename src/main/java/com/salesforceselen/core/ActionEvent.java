package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.salesforce.exception.AppropriateActionNotSelected;
import com.salesforceselen.objectprocess.ClickProcess;
import com.salesforceselen.objectprocess.InputProcess;
import com.salesforceselen.objectprocess.SelectProcess;

public class ActionEvent implements Action{
	
	private WebDriver driver;
	private ArrayList<String> objlist;
	private LinkedHashMap<String,String> hashmpaoj;
	private String objtype;
	private int obj_index;
	private String obj_mame;
	
	
	ActionEvent(WebDriver driver){
		this.driver = driver;
	}
	
	ActionEvent(WebDriver driver,ArrayList<String> objlist){
		this.driver = driver;
		this.objlist = objlist;
	}
	
	ActionEvent(WebDriver driver, LinkedHashMap<String,String> hashmpaoj,ArrayList<String> objlist,String objtype,String obj_mame,int obj_index){
		this.driver = driver;
		this.hashmpaoj = hashmpaoj;
		this.objlist = objlist;
		this.objtype=objtype;
		this.obj_mame = obj_mame;
		this.obj_index = obj_index;
	}
	
	
	public WaitClick wait_to_clickable(int timeInSec){
		return new WaitClick(driver);
	}

	public WaitClick wait_to_present(int timeInSec){
		return new WaitClick(driver);
	}

	public void click() {
		if(clickActionCheck()){
			System.out.println("obj name "+obj_mame+" index "+obj_index);
			ClickProcess cp = new ClickProcess(driver);
			cp.performClick(objlist, obj_mame,obj_index);
		}else{
			throw new AppropriateActionNotSelected("please select correct action type "
					+ "for your action"+objtype+"");
		}
	}

	public SelectOptions select(String text) {
		if(selectActionCheck()){
			System.out.println("obj name "+obj_mame+" index "+obj_index);
			select_dropdown(objtype, text);
		}else{
			throw new AppropriateActionNotSelected("please select correct action type "
					+ "for your action"+objtype+"");
		}
		return new SelectOptions(driver);
	}

	public void enter(String text) {
		if(enterActionCheck()){
			System.out.println("obj name "+obj_mame+" index "+obj_index);
			InputProcess cp = new InputProcess(driver);
			cp.performInput(objlist, obj_mame, obj_index, text);
		}else{
			throw new AppropriateActionNotSelected("please select correct action type for your action "+objtype+"");
		}
	}

	public WebElement getElement() {
		WebElement ele = null ;
		// TODO Auto-generated method stub
		return ele;
	}
	
	private boolean arryContains(String [] array, String value){
		for (String element : array) {
            if (element == value) {
                return true;
            }
        }
		return false;
	}
	
	private boolean clickActionCheck(){
		String [] array = {ObjNameEnum.BUTTON.toString(),ObjNameEnum.TEXTFIELD.toString(),ObjNameEnum.CHECKBOX.toString(),
				ObjNameEnum.LINK.toString(),ObjNameEnum.IMAGE.toString()};
		return arryContains(array, objtype);
	}

	private boolean enterActionCheck(){
		String [] array = {ObjNameEnum.TEXTFIELD.toString(),ObjNameEnum.TEXTAREA.toString()};
		return arryContains(array, objtype);
	}

	private boolean selectActionCheck(){
		String [] array = {"DROPDOWN"};
		return arryContains(array, objtype);
	}
	
	public void select_dropdown(String obj_type, String value){
		SelectProcess sp = new SelectProcess(driver);
		switch(obj_type){
		case "DROPDOWN":
			System.out.println("dropdown ");
			sp.selectDropdown(objlist, obj_mame,obj_index, value);
		case "DROPDOWN_TYPE":
			System.out.println("dropdown type");
			sp.selectDropdown_type(hashmpaoj, obj_mame,obj_index, value);
		case "DROPDOWN_CLICK":
			System.out.println("dropdown click");
			sp.selectDropdown_click(hashmpaoj, obj_mame,obj_index, value);
		case "DROPDOWN_KEYS":
			System.out.println("dropdown keys");
			sp.selectDropdown_keys(hashmpaoj, obj_mame,obj_index, value);
		case "DROPDOWN_MULTIPLE":
			System.out.println("multiple dropddown");
			sp.select_multipleDropdown(objlist, obj_mame,obj_index, value);
		}
	}

}
