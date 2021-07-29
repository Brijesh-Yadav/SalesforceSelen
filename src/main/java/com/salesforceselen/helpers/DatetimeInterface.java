package com.salesforceselen.helpers;

public interface DatetimeInterface {
	
	public String getCurrentDateTime();
	
	public String getDateTimeCustomizedformat(String date_timeformat);
	
	public String getFutureDate(String format, int momth, int days);
	
	public String getDateCustomizedformat(String date_timeformat);
}
