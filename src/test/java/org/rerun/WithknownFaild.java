package org.rerun;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class WithknownFaild implements IRetryAnalyzer {

	int minCount=0,maxCount=5;
	@Override
	public boolean retry(ITestResult result) {
	if(minCount<maxCount) {
		minCount++;
		return true;
	}
		
		return false;
	}

	
	
	
	
	
	
	
	
}
