package com.para;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener
{
public void onStart(ITestContext context) {
	System.out.println("Suit is started");
		
	}

	public void onTestStart(ITestResult result) {
		System.out.println("test case started name" + result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case pass name is "+ result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case fail name "+ result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	

	public void onFinish(ITestContext context) {
		
	}


}
