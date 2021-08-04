package com.salesforceselen.lexrepo;

import java.util.ArrayList;
import java.util.LinkedHashSet;

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
	

}
