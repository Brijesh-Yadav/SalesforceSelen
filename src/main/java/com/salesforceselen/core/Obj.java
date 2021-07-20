package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.salesforceselen.lexrepo.ButtonRepo;

public class Obj {

	public static ObjContainer btn(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button");
	}
	
	public static ArrayList<String> button(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}
	
	public static ArrayList<String> button(String object_name, int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, objindex);
		return button_objs;
	}
	
	public static ArrayList<String> button(String object_name, int objindex, int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, objindex);
		return button_objs;
	}

	public static ArrayList<String> dropdown(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}

	public static ArrayList<String> textfield(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}

	public static ArrayList<String> radiobox(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}
	
	public static ArrayList<String> checkbox(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}

	public static LinkedHashMap<String,String> lightning_dropdown_(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return dropdown_obj;
	}

	public static ArrayList<String> lightning_dropdown_type(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}


}
