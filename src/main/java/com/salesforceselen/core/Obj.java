package com.salesforceselen.core;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.salesforceselen.lexrepo.ButtonRepo;
import com.salesforceselen.objectprocess.ElementCheckProcess;

public class Obj{
	
	private DriverRef ref ;
	
	public void set_DriverRef(DriverRef ref){
		this.ref = ref;
		SFSeleniumutils sf = new SFSeleniumutils();
		sf.set_slndriverref(ref);
		if(ref.gettDriver()!=null){
			System.out.println("Selenium driver object reference is set... under Object class..");
		}
	}
	
	public static ArrayList<String> Button(String obj_nm) {
		System.out.println("button function is called..");
		ArrayList<String> objeclist = ButtonRepo.button_repo(obj_nm, 1);
		Obj ob = new Obj();
		ob.ce(objeclist);
		return objeclist;
	}
	
	public void ce(ArrayList<String> objeclist){
		ElementCheckProcess el = new ElementCheckProcess();
		el.store_present_element(objeclist);
	}
	
	public static ArrayList<String> Button(String obj_nm, int obj_index) {
		ArrayList<String> st = new ArrayList<String>();
		return st;
	}

	public static ArrayList<String> Button(String obj_nm, int obj_index, int html_index) {
		ArrayList<String> st = new ArrayList<String>();
		return st;
	}
	
}
