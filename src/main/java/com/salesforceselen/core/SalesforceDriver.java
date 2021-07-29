package com.salesforceselen.core;

import com.salesforceselen.excel.Excel;
import com.salesforceselen.helpers.DatetimeInterface;
import com.salesforceselen.selenium.Selenium;

public interface SalesforceDriver {
	
	Salesforce salesforce();
	
	Selenium selenium();
	
	DatetimeInterface date();
	
	Excel excel();


}
