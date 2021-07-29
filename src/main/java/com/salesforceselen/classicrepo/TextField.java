package com.salesforceselen.classicrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class TextField {
	
	public static ArrayList<String> textfield_repo(String object_name, int index){
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		//added on 19 June 2021
		obj_list.add("(//button[text()=\""+object_name+"\"])["+index+"]");
		obj_list.add("(//*[text()=\""+object_name+"\"]/ancestor::button)["+index+"]");
		obj_list.add("(//div//input[@value=\""+object_name+"\"])["+index+"]");
		//convert hash to list
		ArrayList<String> arrlist = new ArrayList<String>(obj_list);
		return arrlist;
	}

}