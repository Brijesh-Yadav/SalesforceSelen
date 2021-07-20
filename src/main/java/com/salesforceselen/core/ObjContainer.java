package com.salesforceselen.core;

import java.util.ArrayList;

public class ObjContainer {
	
	public ArrayList<String> patternobjs;
	public String objectype;
	public int objindex;
	public int pattern_index;
	
	public ObjContainer(ArrayList<String> patternobjs, String objectype){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
	}

	public ObjContainer(ArrayList<String> patternobjs, String objectype, int objindex){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
		this.objindex = objindex;
	}

	public ObjContainer(ArrayList<String> patternobjs, String objectype, int objindex,int pattern_index ){
		this.patternobjs = patternobjs;
		this.objectype = objectype;
		this.objindex = objindex;
		this.pattern_index = pattern_index;
	}
}
