package com.salesforceselen.core;

public interface Action {
	
	public void click();
	
	public ActionEvent select(String text);

	public void enter(String text);
	
	public void getElement();
	
	public WaitClick wait_to_clickable(int timeInSec);

	public WaitClick wait_to_present(int timeInSec);
	
	public boolean isSelected();

}
