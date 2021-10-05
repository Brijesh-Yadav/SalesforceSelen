package objecttestpackage;

import com.salesforceselen.core.Attribute;

public class TestScript3 {
	
	public static void main(String []args){
		TestScript3 ts = new TestScript3();
//		String [] arr = {Attribute.id("account"),Attribute.Class("account"),Attribute.name("Account")};
		
		String [] arr = {Attribute.obj.id("username")};
		String label_att = ts.getAttributes("Label",arr).toString();
		String obj_att = ts.getAttributes("Obj",arr).toString();
		String label_attr = label_att.contains("Blank") ? label_att.replace("Blank", ""):label_att;
		String obj_attr = obj_att.contains("Blank") ? obj_att.replace("Blank", ""):obj_att;
		System.out.println(label_attr);
		System.out.println(obj_attr);
		String mobj_attr = "["+obj_attr.substring(3,obj_attr.length())+"]";
		System.out.println("obj_attr "+mobj_attr);
	}
	
	public StringBuilder getAttributes(String type, String [] attributes){
		StringBuilder att = new StringBuilder();
		if(attributes!=null){
			for(int i=0; i<attributes.length; i++){
				String attvalue = attributes[i];
				if(attvalue.contains(type)){
					String att_rm_type = attvalue.replace(type+" ", "");
					att.append(att_rm_type);
				}
			}
		}else{
			att.append("Blank");
		}
		return att;
	}
	
	
	
}
