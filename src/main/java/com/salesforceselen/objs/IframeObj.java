package com.salesforceselen.objs;

import java.util.ArrayList;
import com.salesforceselen.core.ObjContainer;
import com.salesforceselen.lexrepo.ButtonRepo;

public class IframeObj extends DropdownTypeObj{
	
	public static ObjContainer iframe(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer iframe(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer iframe(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new ObjContainer(button_objs,"button",object_name);
	}

}
