package com.salesforceselen.lexrepo;

public class PatternContainer {
	
	public String object_name;
	public int obj_index;
	public int pattern_index;
	public String [] attributes;
	public Object [] b;
	
	public PatternContainer(String object_name,int obj_index,Object... b){
		this.object_name = object_name;
		this.obj_index = obj_index;
		this.b = b;
	}

	public PatternContainer(String object_name,String [] attributes){
		this.object_name = object_name;
		this.attributes = attributes;
	}
	
	public PatternContainer(String object_name,int obj_index,int pattern_index,Object... b){
		this.object_name = object_name;
		this.obj_index = obj_index;
		this.pattern_index = pattern_index;
		this.b = b;
	}

	public PatternContainer(String object_name,int obj_index,int pattern_index,String [] attributes,Object... b){
		this.object_name = object_name;
		this.obj_index = obj_index;
		this.pattern_index = pattern_index;
		this.attributes = attributes;
		this.b = b;
	}

	public PatternContainer(String object_name,Object... b){
		this.object_name = object_name;
		this.b = b;
	}

}
