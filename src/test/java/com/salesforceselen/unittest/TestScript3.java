package com.salesforceselen.unittest;

import com.salesforceselen.core.Attribute;

public class TestScript3 {
	
	public static void main(String []args){
		TestScript3 ts = new TestScript3();
		String [] arr = {Attribute.id("account"),Attribute.Class("account"),Attribute.name("Account")};
		ts.print_values(arr);
	}
	
	public void print_values(String [] arr){
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}

}
