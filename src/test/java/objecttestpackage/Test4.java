package objecttestpackage;

import com.salesforceselen.core.Contains;

public class Test4 {
	
	public  static void foo2(Object... b) {
	    Object[] obj = b;
	    for(Object arrayitem:obj){
	    	if(arrayitem instanceof String){
		    	System.out.println(arrayitem);
	    		System.out.println("String");
	    	}else if(arrayitem instanceof Integer){
		    	System.out.println(arrayitem);
	    		System.out.println("Integer");
	    	}else if(arrayitem instanceof Boolean){
		    	System.out.println(arrayitem);
	    		System.out.println("boolean");
	    	}else{
	    		System.out.println("please select name()");	    		
	    	}
	    }
	}

	public  static Object [] getType(Object... b) {
		Object[] obj = b;
	    for(Object arrayitem:obj){
	    	if(!(arrayitem instanceof String)){
	    		System.out.println("Exception occurs!!");
	    	}
	    }
		return obj;
	}

	
	public static void main(String []args){
		
	}

}
