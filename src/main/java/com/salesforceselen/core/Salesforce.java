package com.salesforceselen.core;

import java.util.ArrayList;

public interface Salesforce {
	
	Pattern pattern();
	Traverse traverse();
	
	interface Pattern{
		
		ActionEvent getObj(ArrayList<String> obj);
	}
	
	interface Traverse{
		
	}

}
