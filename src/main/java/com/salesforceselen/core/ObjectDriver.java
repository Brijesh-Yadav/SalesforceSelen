package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.openqa.selenium.WebDriver;
import com.salesforce.sftable.CellContainer;
import com.salesforceselen.core.Salesforce.Pattern;
import com.salesforceselen.objectprocess.ElementCheckProcess;

public class ObjectDriver implements Pattern{
	
	private WebDriver driver;
	
	protected ObjectDriver(WebDriver driver){
		this.driver = driver;
	}

	public ActionEvent getObj(ObjContainer obj) {
		String objtp = obj.objectype;
		String objname = obj.objectName;
		int obj_ind = obj.objindex;
		ArrayList<String> objlist = obj.patternobjs;
		LinkedHashMap<String,String> dropdown_mapo = obj.d_patternobjs;
		ArrayList<String> present_ele = new ArrayList<String> ();
		ElementCheckProcess ec = new ElementCheckProcess(driver);
		present_ele = ec.store_present_element(objlist);
		return new ActionEvent(driver,dropdown_mapo,present_ele,objtp,objname,obj_ind);
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
		return new ActionEvent(driver,tablelistobj);
	}

	public ObjectDriver getObjectDriver() {
		// TODO Auto-generated method stub
		return new ObjectDriver(driver);
	}
	
}
