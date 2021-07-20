package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class ButtonRepo extends CommonRepoFun{
	
	public static ArrayList<String> button_repo(String object_name, int index){
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		//added on 19 June 2021
		obj_list.add("(//button[text()=\""+object_name+"\"])["+getIndex(index)+"]");
		obj_list.add("(//*[text()=\""+object_name+"\"]/ancestor::button)["+getIndex(index)+"]");
		obj_list.add("(//input[@name=\""+object_name+"\"])["+getIndex(index)+"]");
		//convert hash to list
		ArrayList<String> arrlist = new ArrayList<String>(obj_list);
		return arrlist;
	}
	

}
