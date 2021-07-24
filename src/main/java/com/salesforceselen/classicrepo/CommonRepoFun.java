package com.salesforceselen.classicrepo;


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
	

}
