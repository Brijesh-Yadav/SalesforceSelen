package com.salesforceselen.unittest;

import com.modularactions.Global;
import com.test.driverpakcage.BaseClass;

public class SF01_TestScript extends BaseClass{
	
	public static void main(String []args){
		SF01_TestScript bs = new SF01_TestScript();
		bs.executetestscript();
		bs.closeBrowser();
	}
	
	public void executetestscript(){
		launchApplication();
		Global gb = new Global(driver);
		gb.loginIntoApplication();
	}
	
	public void closeBrowser(){
		closeApplication();
	}

}
