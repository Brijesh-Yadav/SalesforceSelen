package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.salesforce.sftable.TableAction;
import com.salesforceselen.lexrepo.LexButtonRepo;
import com.salesforceselen.lexrepo.LexTextFieldRepo;

/**
 * @author brijesh-Yadav
 * @category
 * Button,Checkbox,Dropdown,DropdownType,Iframe,Image,LightningDropdownClick,LightningDropdownKeys,
 * LightningDropdownType,Link,MultipleDropdown,Radiobox,RichTextEditor,Table,Textarea,Textfield
 * TextfieldValue,Text
 * @methodType
 * action("text"),action("text",obj_index),action("text",obj_index,pattern_index),action("text",[]array_attribute),
 */
public interface Obj {

	/**
	 * @category - Button
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer button(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer button(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, objindex,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}
	
	public static ObjContainer button(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer button(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, objindex,pat_index);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer button(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, objindex,pat_index);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	/**
	 * @category - Checkbox
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer checkbox(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer checkbox(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer checkbox(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, objindex,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer checkbox(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer checkbox(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	/**
	 * @category - DropdownObj
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer dropdown(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer dropdown(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer dropdown(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer dropdown(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer dropdown(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	/**
	 * @category - DropdownType
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	
	
	
	/**
	 * @category - Iframe
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	
	public static ObjContainer iframe(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer iframe(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer iframe(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	/**
	 * @category - Image
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	
	public static ObjContainer image(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}
	
	public static ObjContainer image(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer image(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer image(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	public static ObjContainer image(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name);
	}

	
	/**
	 * @category - lightning_dropdown_click
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer lightning_dropdown_click(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}

	/**
	 * @category - lightning_dropdown_click
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer lightning_dropdown_keys(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,objindex);
	}

	/**
	 * @category - lightning_dropdown_type
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	
	public static ObjContainer lightning_dropdown_type(String object_name){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = new LinkedHashMap<String,String>();
		return new ObjContainer(dropdown_obj,"button",object_name,1);
	}

	/**
	 * @category - Link
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer link(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer link(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	/**
	 * @category - multiple_dropdown
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */

	public static ObjContainer multiple_dropdown(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer multiple_dropdown(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	/**
	 * @category - radiobox
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */


	public static ObjContainer radiobox(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer radiobox(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	/**
	 * @category - Rich Text Editor
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */


	/**
	 * @category - Table
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static TableAction table(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new TableAction(button_objs);
	}

	/**
	 * @category - Textarea
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer textarea(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer textarea(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	/**
	 * @category - textfield
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */

	public static ObjContainer textfield(String object_name){
		ArrayList<String> textfield_objs = new ArrayList<String>();
		textfield_objs = LexTextFieldRepo.pattern(object_name, 1,0);
		return new ObjContainer(textfield_objs,"textfield",object_name,1);
	}
	
	public static ObjContainer textfield(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield",object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield",object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield",object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield",object_name,1);
	}

	/**
	 * @category - textfield Value
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	
	/**
	 * @category - Text
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer text(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer text(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}
	
	public static ObjContainer text(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer text(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer text(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonRepo.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}


}
