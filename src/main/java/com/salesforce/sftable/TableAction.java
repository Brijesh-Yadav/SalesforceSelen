package com.salesforce.sftable;

import java.util.ArrayList;

public class TableAction {
	
	static ArrayList<String> tablelist = new ArrayList<String>();
	
	public TableAction(ArrayList<String> tablelist){
		TableAction.tablelist = tablelist;
	}
	
	public CellContainer getCell(int row, int col){
		return new CellContainer(tablelist,row, col);
	}

	public CellContainer getCell(int col, String object){
		return new CellContainer(tablelist,col, object);
	}

	public CellContainer getCell(String colheader, String object){
		return new CellContainer(tablelist,colheader, object);
	}
	
	public CellContainer getCell(String [] col_vlues, String object){
		return new CellContainer(tablelist,col_vlues, object);
	}
	
}
