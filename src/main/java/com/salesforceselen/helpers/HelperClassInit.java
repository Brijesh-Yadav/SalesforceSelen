package com.salesforceselen.helpers;


public class HelperClassInit implements Helper{

	@Override
	public BrowserStack getBrowserStackInst() {
		return new BrowserStack();
	}

	@Override
	public Excel getExcelInst() {
		return new Excel();
	}

}
