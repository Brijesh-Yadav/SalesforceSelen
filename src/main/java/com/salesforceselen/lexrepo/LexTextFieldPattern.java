package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.salesforceselen.core.SetGetConfig;

public class LexTextFieldPattern extends CommonRepoFun{

	public static ArrayList<String> pattern(PatternContainer pc){
		System.out.println("version "+SetGetConfig.sfversion);
		LinkedHashSet<String> obj_list = new LinkedHashSet<String>();
		//store attributes
		String label_attr = pc.attributes!=null? getLabel_attribute(pc):"";
		String mobj_attr = pc.attributes!=null? getObj_attribute(pc):"";
		//
		Object [] ob = pc.b;
		System.out.println(ob.length);
	    for(Object arrayitem:ob){
	    	System.out.println("type data - "+arrayitem);
	    }
		//added on 19 June 2021
		obj_list.add("(//input[@name=\""+pc.object_name+"\""+label_attr+"])["+getIndex(pc.obj_index)+"]");
		obj_list.add("(//input[@id=\""+pc.object_name+"\""+label_attr+"])["+getIndex(pc.obj_index)+"]");
		obj_list.add("(//input[@class=\""+pc.object_name+"\""+label_attr+"])["+getIndex(pc.obj_index)+"]");
		obj_list.add("(//label[text()=\""+pc.object_name+"\""+label_attr+"]/following-sibling::div[1]//input"+mobj_attr+")["+getIndex(pc.obj_index)+"]");
		obj_list.add("(//label[text()=\""+pc.object_name+"\""+label_attr+"]/following-sibling::input[1]"+mobj_attr+")["+getIndex(pc.obj_index)+"]");
		//convert hash to list
		ArrayList<String> arrlist = gtObjectlist(obj_list, pc.pattern_index);
		return arrlist;
	}

}
