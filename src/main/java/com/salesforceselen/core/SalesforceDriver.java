package com.salesforceselen.core;

import com.salesforceselen.selenium.Selenium;

public interface SalesforceDriver {
	
	Salesforce salesforce();
	
	Selenium selenium();

}
