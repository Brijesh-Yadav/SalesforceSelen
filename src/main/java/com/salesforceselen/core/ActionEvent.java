package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.openqa.selenium.WebDriver;
import com.salesforce.exception.AppropriateActionNotSelected;
import com.salesforceselen.objectprocess.ClickProcess;

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
			throw new AppropriateActionNotSelected("Approviate actioin is not selected.. "
					+ "please select correct action type for your object type"+objtype+"");
		}
	}

	public ActionEvent select(String text) {
		// TODO Auto-generated method stub
		return new ActionEvent(driver);
	}

	public void enter(String text) {
		// TODO Auto-generated method stub
		
	}

	public void getElement() {
		// TODO Auto-generated method stub
		
	}

	public boolean isSelected() {
		// TODO Auto-generated method stub
		return false;
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
		String [] array = {"button","textfield","radiobox","checkbox","link","image"};
		return arryContains(array, objtype);
	}
	
}
