package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import com.salesforceselen.core.SetGetConfig;

public class LexLightningDropdownPattern extends CommonRepoFun{
	
	public static LinkedHashMap<String,String> map_pattern(String label_name, int index,int patternIndex){
		System.out.println("version "+SetGetConfig.sfversion);
		LinkedHashMap<String,String> hm = new LinkedHashMap<String, String>();
		hm.put("(//lightning-combobox/*[text()=\""+label_name+"\"])["+index+"]","/..//lightning-base-combobox-item");
		hm.put("(//*[text()=\""+label_name+"\"]/ancestor::div[1]/input)["+index+"]","/..//div[@class='address-selection']/div[@class='pl-label']");
		hm.put("(//label[text()=\""+label_name+"\"]/..//input)["+index+"]","/../following-sibling::div[1]//lightning-base-combobox-item");
		LinkedHashMap<String,String> obj_map = gtObjectlist(hm,patternIndex);
		return obj_map;
	}
	
	
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
