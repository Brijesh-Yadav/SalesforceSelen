package com.salesforceselen.core;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.salesforceselen.core.Salesforce.Pattern;

public class ElementObject implements Pattern{
	
	private DriverRef ref;
	
	public void setDriverRef(DriverRef ref){
		this.ref = ref;
		Obj obj = new Obj();
		obj.set_DriverRef(this.ref);
		if(ref.gettDriver()!=null){
			System.out.println("obj driver object reference is set... under elementobject..");
		}
	}
	
	public ActionEvent getObj(ArrayList<String> obj) {
		System.out.println("get object is called..");
		// TODO Auto-generated method stub
		return new ActionEvent();
	}

}
