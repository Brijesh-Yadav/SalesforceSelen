package com.salesforceselen.core;

import com.salesforceselen.datetime.DatetimeUtils;
import com.salesforceselen.excel.Excel;
import com.salesforceselen.selenium.Selenium;

public interface SalesforceDriver {
	
	Salesforce salesforce();
	
	Selenium selenium();
	
	DatetimeUtils date();
	
	Excel excel();


}
