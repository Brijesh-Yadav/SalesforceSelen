package com.salesforceselen.core;

public class SetGetConfig {
	
	public static String sfversion;
	
	public static void set_sfversion(String sfversion){
		SetGetConfig.sfversion = sfversion;
	}
	
	public static String getsfversion(){
		return sfversion;
	}

}
