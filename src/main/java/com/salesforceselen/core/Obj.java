package com.salesforceselen.core;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import com.salesforce.sftable.TableAction;
import com.salesforceselen.lexrepo.LexButtonPattern;
import com.salesforceselen.lexrepo.LexLightningDropdownPattern;
import com.salesforceselen.lexrepo.LexLinkPattern;
import com.salesforceselen.lexrepo.LexTextFieldPattern;
import com.salesforceselen.lexrepo.LexText_fieldvaluePattern;
import com.salesforceselen.lexrepo.PatternContainer;

/**
 * @author brijesh-Yadav
 * @category
 * Button,Checkbox,Dropdown,DropdownType,Iframe,Image,LightningDropdownClick,LightningDropdownKeys,
 * LightningDropdownType,Link,MultipleDropdown,Radiobox,RichTextEditor,Table,Textarea,Textfield
 * TextfieldValue,Text
 * @methodType
 * action("text"),action("text",obj_index),action("text",obj_index,pattern_index),action("text",[]array_attribute),
 */
public class Obj {

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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer button(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, objindex,0);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}
	
	public static ObjContainer button(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"button",object_name,1);
	}

	public static ObjContainer button(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, objindex,pat_index);
		return new ObjContainer(button_objs,"button",object_name,objindex);
	}

	public static ObjContainer button(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, objindex,pat_index);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"checkbox",object_name);
	}
	
	public static ObjContainer checkbox(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"checkbox",object_name,1);
	}

	public static ObjContainer checkbox(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, objindex,0);
		return new ObjContainer(button_objs,"checkbox",object_name,objindex);
	}

	public static ObjContainer checkbox(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"checkbox",object_name,objindex);
	}

	public static ObjContainer checkbox(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"checkbox",object_name,objindex);
	}
	
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"iframe",object_name);
	}
	
	public static ObjContainer iframe(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"iframe",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"iframe",object_name);
	}

	public static ObjContainer iframe(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"iframe",object_name);
	}
	
	public static ObjContainer iframe(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"iframe",object_name);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"image",object_name);
	}
	
	public static ObjContainer image(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"image",object_name);
	}

	public static ObjContainer image(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"image",object_name);
	}

	public static ObjContainer image(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"image",object_name);
	}

	public static ObjContainer image(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"image",object_name);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"dropdown",object_name,1);
	}
	
	public static ObjContainer dropdown(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"dropdown",object_name,1);
	}

	public static ObjContainer dropdown(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"dropdown",object_name,objindex);
	}

	public static ObjContainer dropdown(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"dropdown",object_name,objindex);
	}

	public static ObjContainer dropdown(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"dropdown",object_name,objindex);
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
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_click",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_click",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, objindex, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_click",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, objindex, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_click",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_click(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, objindex, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_click",object_name,objindex);
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
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_keys",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_keys",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_keys",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_keys",object_name,objindex);
	}
	
	public static ObjContainer lightning_dropdown_keys(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_keys",object_name,objindex);
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
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_type",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_type",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, 0);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_type",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_type",object_name,1);
	}
	
	public static ObjContainer lightning_dropdown_type(String object_name,int objindex,int pat_index, String [] attribute){
		LinkedHashMap<String,String> dropdown_obj = LexLightningDropdownPattern.map_pattern(object_name, 1, pat_index);
		return new ObjContainer(dropdown_obj,"lightning_dropdown_type",object_name,1);
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
		button_objs = LexLinkPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"link",object_name,1);
	}
	
	public static ObjContainer link(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"link",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"link",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"link",object_name,1);
	}

	public static ObjContainer link(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"link",object_name,1);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"multiple_dropdown",object_name,1);
	}
	
	public static ObjContainer multiple_dropdown(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"multiple_dropdown",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"multiple_dropdown",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"multiple_dropdown",object_name,1);
	}

	public static ObjContainer multiple_dropdown(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"multiple_dropdown",object_name,1);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"radiobox",object_name,1);
	}
	
	public static ObjContainer radiobox(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"radiobox",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"radiobox",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"radiobox",object_name,1);
	}

	public static ObjContainer radiobox(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"radiobox",object_name,1);
	}

	/**
	 * @category - Rich Text Editor
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer richTextEditor(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"richTextEditor",object_name,1);
	}
	
	public static ObjContainer richTextEditor(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"richTextEditor",object_name,1);
	}

	public static ObjContainer richTextEditor(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"richTextEditor",object_name,1);
	}

	public static ObjContainer richTextEditor(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"richTextEditor",object_name,1);
	}

	public static ObjContainer richTextEditor(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"richTextEditor",object_name,1);
	}


	/**
	 * @category - Table
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static TableAction table(String headerColText){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(headerColText, 1,0);
		return new TableAction(button_objs);
	}
	
	public static TableAction table(String headerColText, int index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(headerColText, 1,0);
		return new TableAction(button_objs);
	}

	public static TableAction table(String headerColText, int index, int patternIndex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(headerColText, 1,patternIndex);
		return new TableAction(button_objs);
	}

	public static TableAction table(String headerColText, String[] attributes){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(headerColText, 1,0);
		return new TableAction(button_objs);
	}

	public static TableAction table(String headerColText, String[] attributes,int patternIndex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(headerColText, 1,0);
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textarea",object_name,1);
	}
	
	public static ObjContainer textarea(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textarea",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textarea",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textarea",object_name,1);
	}

	public static ObjContainer textarea(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textarea",object_name,1);
	}

	/**
	 * @category - textfield
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */

	public static ObjContainer textfield(String object_name, Object... b){
		ArrayList<String> textfield_objs = new ArrayList<String>();
		textfield_objs = LexTextFieldPattern.pattern(setParameter(object_name,b));
		return new ObjContainer(textfield_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	public static ObjContainer textfield(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,attribute));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	public static ObjContainer textfield(String object_name,String [] attribute,Object... b){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,attribute,b));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex,String [] attribute,Object... b){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,objindex,attribute,b));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}
	
	public static ObjContainer textfield(String object_name,int objindex,Object... b){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,objindex,b));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex,int pat_index,Object... b){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,objindex,pat_index,b));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	public static ObjContainer textfield(String object_name,int objindex,int pat_index, String [] attribute,Object... b){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexTextFieldPattern.pattern(setParameter(object_name,objindex,pat_index,attribute,b));
		return new ObjContainer(button_objs,ObjNameEnum.TEXTFIELD.toString(),object_name,1);
	}

	/**
	 * @category - textfield Value
	 */
	
	/**
	 * 
	 * @param object_name
	 * @return
	 */
	public static ObjContainer textfield_with_value(String object_name){
		ArrayList<String> textfield_objs = new ArrayList<String>();
		textfield_objs = LexText_fieldvaluePattern.pattern(object_name, 1,0);
		return new ObjContainer(textfield_objs,"textfield_with_value",object_name,1);
	}
	
	public static ObjContainer textfield_with_value(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexText_fieldvaluePattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield_with_value",object_name,1);
	}

	public static ObjContainer textfield_with_value(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexText_fieldvaluePattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield_with_value",object_name,1);
	}

	public static ObjContainer textfield_with_value(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexText_fieldvaluePattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield_with_value",object_name,1);
	}

	public static ObjContainer textfield_with_value(String object_name,int objindex,int pat_index, String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexText_fieldvaluePattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"textfield_with_value",object_name,1);
	}
	
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
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"text",object_name,1);
	}

	public static ObjContainer text(String object_name){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"text",object_name,1);
	}
	
	public static ObjContainer text(String object_name,String [] attribute){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"text",object_name,1);
	}

	public static ObjContainer text(String object_name,int objindex){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"text",object_name,1);
	}

	public static ObjContainer text(String object_name,int objindex,int pat_index){
		ArrayList<String> button_objs = new ArrayList<String>();
		button_objs = LexButtonPattern.pattern(object_name, 1,0);
		return new ObjContainer(button_objs,"text",object_name,1);
	}

	private static PatternContainer setParameter(String object_name,Object... b){
		return new PatternContainer(object_name,1,0,b);
	}

	private static PatternContainer setParameter(String object_name,String [] attributes){
		return new PatternContainer(object_name,1,0,attributes);
	}

	private static PatternContainer setParameter(String object_name,int obj_index,Object... b){
		return new PatternContainer(object_name,obj_index,0,b);
	}

	private static PatternContainer setParameter(String object_name,String [] attributes,Object... b){
		return new PatternContainer(object_name,1,0,attributes,b);
	}

	private static PatternContainer setParameter(String object_name,int obj_index,String [] attributes,Object... b){
		return new PatternContainer(object_name,1,obj_index,attributes,b);
	}
	
	private static PatternContainer setParameter(String object_name,int obj_index,int pattern_index,Object... b){
		return new PatternContainer(object_name,obj_index,pattern_index,b);
	}
	
	private static PatternContainer setParameter(String object_name,int obj_index, int pattern_index, String [] attributes,Object... b){
		return new PatternContainer(object_name,obj_index,pattern_index,attributes,b);
	}
	
	private  static Object [] getType(Object... b) {
		Object[] obj = b;
	    for(Object arrayitem:obj){
	    	if(!(arrayitem instanceof String)){
	    		System.out.println("Exception occurs!!");
	    	}
	    }
		return obj;
	}


}
