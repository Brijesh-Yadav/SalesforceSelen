package com.salesforceselen.objs;

import java.util.ArrayList;

import com.salesforce.sftable.TableAction;
import com.salesforceselen.lexrepo.ButtonRepo;

public class TableObj extends RichTextEditorObj{
	
	public static TableAction table(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = ButtonRepo.button_repo(object_name, 1);
		return new TableAction(button_objs);
	}

}
