package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;

import com.salesforce.sftable.CellContainer;
import com.salesforceselen.core.Salesforce.Pattern;
import com.salesforceselen.lexrepo.ButtonRepo;
import com.salesforceselen.objectprocess.ElementCheckProcess;

public class ElementObject implements Pattern{
	
	private WebDriver driver;
	
	protected ElementObject(WebDriver driver){
		this.driver = driver;
	}
	
	public ActionEvent getObj(ArrayList<String> obj) {
		System.out.println("get object is called..");
		ElementCheckProcess ec = new ElementCheckProcess(driver);
		ec.store_present_element(obj);
		// TODO Auto-generated method stub
		return new ActionEvent(driver);
	}

	public SelectEvent getObj(LinkedHashMap<String, String> obj) {
		// TODO Auto-generated method stub
		return new SelectEvent(driver);
	}

	public Verify verify() {
		// TODO Auto-generated method stub
		return new ExecuteVerification(driver);
	}

	public ActionEvent getObj(ObjContainer obj) {
		String objtp = obj.objectype;
		ArrayList<String> objlist = obj.patternobjs;
		// TODO Auto-generated method stub
		System.out.println("print button type "+objtp);
		for(int i=0; i<objlist.size(); i++){
			System.out.println(objlist.get(i));
		}
		return new ActionEvent(driver);
	}

	public ActionEvent getObj(Object object) {
		// TODO Auto-generated method stub
		return new ActionEvent(driver);
	}

	public ActionEvent getObj(CellContainer tc) {
		ArrayList<String> tablelistobj = new ArrayList<String>();
		String abs = tc.col_header;
		tablelistobj = tc.tablelist;
		int col = tc.col;
		int row = tc.row;
		String object = tc.object;
		String [] arr = tc.m_value;
		
//		System.out.println(abs);
//		System.out.println(col);
//		System.out.println(row);
		System.out.println(object);
//		System.out.println(arr);
		System.out.println(tablelistobj);
		
		// TODO Auto-generated method stub
		return new ActionEvent(driver);
	}

}
