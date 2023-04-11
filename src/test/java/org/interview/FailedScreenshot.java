package org.interview;

import java.io.IOException;

import org.base.BaseClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class FailedScreenshot extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailure(ITestResult r) {
		try {
			BaseClass.screenshot("facebook"+r.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
				
	}

	@Override
	public void onStart(ITestContext context) {
				
	}

	@Override
	public void onFinish(ITestContext context) {
			
	}

	
	
}
