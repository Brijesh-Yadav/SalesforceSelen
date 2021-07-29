package com.salesforceselen.core;

import com.salesforce.sftable.CellContainer;

public interface Salesforce {
	
	Pattern pattern();
	Traverse traverse();
	
	interface Pattern{
		ActionEvent getObj(CellContainer tc);
		ActionEvent getObj(ObjContainer obj);
		ObjectDriver getObjectDriver();
	}
	
	interface Traverse{
		
	}

}
