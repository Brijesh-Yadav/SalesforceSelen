package com.salesforceselen.objs;

import java.util.LinkedHashMap;
import com.salesforceselen.core.ObjContainer;

public class LightningDropdownType extends LightningDropdownKeys{
	
	public static ObjContainer lightning_dropdown_type(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button");
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button");
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button");
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button");
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button");
	}

}
