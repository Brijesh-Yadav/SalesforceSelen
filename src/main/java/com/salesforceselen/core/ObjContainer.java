package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ObjContainer {
	
	public ArrayList<String> patternobjs;
	public LinkedHashMap<String,String> d_patternobjs;
	public String objectype;
	public int objindex;
	public int pattern_index;
	public String objectName;
	
	public ObjContainer(ArrayList<String> patternobjs, String objectype, String objectName){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
		this.objectName = objectName;
	}

	public ObjContainer(LinkedHashMap<String,String> d_patternobjs, String objectype,String objectName,int objindex){
		this.d_patternobjs = d_patternobjs;
		this.objectype = objectype;
	}
	
	public ObjContainer(ArrayList<String> patternobjs, String objectype, String objectName, int objindex){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
		this.objindex = objindex;
		this.objectName=objectName;
	}

	public ObjContainer(ArrayList<String> patternobjs, String objectype,String objectName, int objindex,int pattern_index ){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
		this.objindex = objindex;
		this.pattern_index = pattern_index;
	}
}
