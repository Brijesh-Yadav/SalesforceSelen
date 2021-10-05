package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

import com.salesforceselen.core.SetGetConfig;

public class LexTablePattern extends CommonRepoFun{
	
	public static ArrayList<String> pattern(String object_name, int index, int patternIndex){
		System.out.println("version "+SetGetConfig.sfversion);
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		//added on 19 June 2021
		obj_list.add("//tr/th//span[text()=\""+object_name+"\"]/ancestor::table[1])["+getIndex(index)+"]");
		obj_list.add("//tr/th//label/span[text()=\""+object_name+"\"]/ancestor::table[1])["+getIndex(index)+"]");
		obj_list.add("//tr/th//label[text()=\""+object_name+"\"]/ancestor::table[1])["+getIndex(index)+"]");
		obj_list.add("//tr/th//div[text()=\""+object_name+"\"]/ancestor::table[1])["+getIndex(index)+"]");
		obj_list.add("//tr/th//div/span[text()=\""+object_name+"\"]/ancestor::table[1])["+getIndex(index)+"]");
		//convert hash to list
		ArrayList<String> arrlist = gtObjectlist(obj_list, patternIndex);
		return arrlist;
	}

}
