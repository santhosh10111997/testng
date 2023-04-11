package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class With implements IRetryAnalyzer {

	int min=0, max=5;
	@Override
	public boolean retry(ITestResult result) {
		if(min<max) {
			min++;
			return true;
		}
		return false;
	}
	
	

}
