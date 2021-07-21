package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.salesforce.sftable.CellContainer;

public interface Salesforce {
	
	Pattern pattern();
	Traverse traverse();
	
	interface Pattern{
		
		ActionEvent getObj(ArrayList<String> objqwe);
		ActionEvent getObj(CellContainer tc);
		ActionEvent getObj(ObjContainer obj);
		SelectEvent getObj(LinkedHashMap<String,String> obj);
		Verify verify();
	}
	
	interface Traverse{
		
	}

}
