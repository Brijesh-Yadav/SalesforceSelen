package com.salesforceselen.core;

public class HtmlAttributes {
	
	public static String name(String name) {
		String att = "and@name=\"" + name + "\"";
		return att;
	}

	public static String id(String id) {
		String att = "and@id=\"" + id + "\"";
		return att;
	}

	public static String Class(String Class) {
		String att = "and@class=\"" + Class + "\"";
		return att;
	}

	public static String placeholder(String placeholder) {
		String att = "and@class=\"" + placeholder + "\"";
		return att;
	}

	public static String type(String type) {
		String att = "and@type=\"" + type + "\"";
		return att;
	}


}
