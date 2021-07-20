package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public interface Salesforce {
	
	Pattern pattern();
	Traverse traverse();
	
	interface Pattern{
		
		ActionEvent getObj(ArrayList<String> obj);
		SelectEvent getObj(LinkedHashMap<String,String> obj);
		Verify verify();
	}
	
	interface Traverse{
		
	}

}
