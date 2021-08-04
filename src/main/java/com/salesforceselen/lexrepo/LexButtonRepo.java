package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.salesforceselen.core.SetGetConfig;

public class LexButtonRepo extends CommonRepoFun{
	
	public static ArrayList<String> pattern(String object_name, int index, int patternIndex){
		System.out.println("version "+SetGetConfig.sfversion);
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		//added on 19 June 2021
		obj_list.add("(//button[text()=\""+object_name+"\"])["+getIndex(index)+"]");
		obj_list.add("(//*[text()=\""+object_name+"\"]/ancestor::button)["+getIndex(index)+"]");
		obj_list.add("(//input[@name=\""+object_name+"\"])["+getIndex(index)+"]");
		//convert hash to list
		ArrayList<String> arrlist = gtObjectlist(obj_list, patternIndex);
		return arrlist;
	}
	

}
