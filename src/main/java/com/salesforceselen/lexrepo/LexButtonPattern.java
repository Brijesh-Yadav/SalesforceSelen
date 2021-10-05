package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.salesforceselen.core.SetGetConfig;

public class LexButtonPattern extends CommonRepoFun{
	
	public static ArrayList<String> pattern(String object_name, int index, int patternIndex){
		System.out.println("version "+SetGetConfig.sfversion);
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		obj_list.add("(//button[text()=\""+object_name+"\"])["+getIndex(index)+"]"); // button
		obj_list.add("(//*[text()=\""+object_name+"\"]/ancestor::button)["+getIndex(index)+"]"); //button
		obj_list.add("(//input[@name=\""+object_name+"\"])["+getIndex(index)+"]"); //input
		//convert hash to list
		ArrayList<String> arrlist = gtObjectlist(obj_list, patternIndex);
		return arrlist;
	}
	

}
