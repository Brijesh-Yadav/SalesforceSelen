package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class CommonRepoFun {

	public static int getIndex(int index) {
		int ind = 0;
		if (index == 0) {
			ind = 1;
		} else {
			ind = index;
		}
		return ind;
	}
	
	public static ArrayList<String> gtObjectlist(LinkedHashSet<String> obj_list, int patternIndex){
		ArrayList<String> objectlist;
		if(patternIndex>0){
			ArrayList<String> arrlist2 = new ArrayList<String>(obj_list);
			objectlist = new ArrayList<String>();
			objectlist.add(arrlist2.get(patternIndex-1));
		}else{
			objectlist = new ArrayList<String>(obj_list);
		}
		return objectlist;
	}
	
	public static LinkedHashMap<String,String> gtObjectlist(LinkedHashMap<String,String> obj_list, int patternIndex){
		LinkedHashMap<String,String> new_obj_list;
		if(patternIndex>0){
			int ptindex = 1;
			new_obj_list = new LinkedHashMap<String,String>();
			for (Map.Entry<String, String> entry : obj_list.entrySet()) {
				String xpath_key = entry.getKey();
				String option = entry.getValue();
				if(ptindex==patternIndex){
					new_obj_list.put(xpath_key, option);
					break;
				}
				ptindex++;
			}
		}else{
			new_obj_list = new LinkedHashMap<String,String>(obj_list);
		}
		return new_obj_list;
	}
	
	public static StringBuilder getAttributes(String type, String [] attributes){
		StringBuilder att = new StringBuilder();
		if(attributes!=null){
			for(int i=0; i<attributes.length; i++){
				String attvalue = attributes[i];
				if(attvalue.contains(type)){
					String att_rm_type = attvalue.replace(type+" ", "");
					att.append(att_rm_type);
				}
			}
		}else{
			att.append("Blank");
		}
		return att;
	}
	
	public static String getLabel_attribute(PatternContainer pc){
		String label_attributes = getAttributes("Label", pc.attributes).toString();
		String label_attr = label_attributes.contains("Blank") ? label_attributes.replace("Blank", ""):label_attributes;
		return label_attr;
	}
	
	public static String getObj_attribute(PatternContainer pc){
		String obj_attributes = getAttributes("Obj", pc.attributes).toString();
		String obj_attr = obj_attributes.contains("Blank") ? obj_attributes.replace("Blank", ""):obj_attributes;
		String mobj_attr = "["+obj_attr.substring(3,obj_attr.length())+"]";
		return mobj_attr;
	}
	

}
