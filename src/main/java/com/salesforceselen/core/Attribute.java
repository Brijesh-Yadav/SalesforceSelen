package com.salesforceselen.core;

public class Attribute {

	public static class Label {
		//define label specific attributes
		public static String name(String name) {
			String att = "Label and@name=\"" + name + "\"";
			return att;
		}

		public static String id(String id) {
			String att = "Label and@id=\"" + id + "\"";
			return att;
		}

		public static String Class(String Class) {
			String att = "Label and@class=\"" + Class + "\"";
			return att;
		}

		public static String placeholder(String placeholder) {
			String att = "Label and@class=\"" + placeholder + "\"";
			return att;
		}

		public static String type(String type) {
			String att = "Label and@type=\"" + type + "\"";
			return att;
		}

	}

	public static class obj {
		// define object specific attributes
		public static String name(String name) {
			String att = "Obj and@name=\"" + name + "\"";
			return att;
		}

		public static String id(String id) {
			String att = "Obj and@id=\"" + id + "\"";
			return att;
		}

		public static String Class(String Class) {
			String att = "Obj and@class=\"" + Class + "\"";
			return att;
		}

		public static String placeholder(String placeholder) {
			String att = "Obj and@class=\"" + placeholder + "\"";
			return att;
		}

		public static String type(String type) {
			String att = "Obj and@type=\"" + type + "\"";
			return att;
		}

	}

}
