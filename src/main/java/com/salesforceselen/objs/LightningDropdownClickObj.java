package com.salesforceselen.objs;

import java.util.LinkedHashMap;

import com.salesforceselen.core.ObjContainer;

public class LightningDropdownClickObj extends ImageObj{
	
	public static ObjContainer lightning_dropdown_click(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}

}
