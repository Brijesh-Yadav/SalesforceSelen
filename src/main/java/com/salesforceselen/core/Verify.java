package com.salesforceselen.core;

public interface Verify {
	
	boolean text(String text);
	boolean text(String text, int objindex);
	boolean text(String text, int objindex, int pat_index);
	
	boolean textfield_with_value(String text);
	boolean textfield_with_value(String text, int objindex);
	boolean textfield_with_value(String text, int objindex, int pat_index);
	
	boolean image(String text);
	boolean image(String text, int objindex);
	boolean image(String text, int objindex, int pat_index);

	
}
