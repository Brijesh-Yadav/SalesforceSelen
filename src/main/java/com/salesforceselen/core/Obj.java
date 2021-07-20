package com.salesforceselen.core;

import java.util.ArrayList;

import com.salesforceselen.lexrepo.ButtonRepo;

public class Obj {
	
	public static ArrayList<String> Button(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return button_objs;
	}
	
	public static ArrayList<String> Button(String object_name, int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, objindex);
		return button_objs;
	}
	
	public static ArrayList<String> Button(String object_name, int objindex, int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, objindex);
		return button_objs;
	}



}
