package com.salesforce.sftable;

import java.util.ArrayList;

public class CellContainer {
	
	public int row ;
	public int col ;
	public String object;
	public String [] m_value;
	public String col_header;
	public ArrayList<String> tablelist = new ArrayList<String>();

	public CellContainer(ArrayList<String> tablelist, int row, int col){
		this.tablelist = tablelist;
		this.row = row;
		this.col = col;
	}

	public CellContainer(ArrayList<String> tablelist,int col, String object){
		this.tablelist = tablelist;
		this.col = col;
		this.object=object;
	}

	public CellContainer(ArrayList<String> tablelist,String col_header, String object){
		this.tablelist = tablelist;
		this.col_header=col_header;
		this.object=object;
	}

	public CellContainer(ArrayList<String> tablelist,String [] m_value, String object){
		this.tablelist = tablelist;
		this.m_value=m_value;
		this.object=object;
	}

}
