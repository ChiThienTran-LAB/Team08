package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
	@Override
	public void onFinish(ITestContext agr0) 
	{
		System.out.println("Đã test xong hết tất cả Testcase");
	}
	@Override
	public void onStart(ITestContext agr0) 
	{
		System.out.println("Bắt đầu test");
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult agr0) 
	{
		
	}
	@Override
	public void onTestFailure(ITestResult agr0) 
	{
		System.out.println("Có test case bị failed");
	}
	@Override
	public void onTestSkipped(ITestResult agr0) 
	{
		
	}
	@Override
	public void onTestStart(ITestResult agr0) 
	{
		
	}
	@Override
	public void onTestSuccess(ITestResult agr0) 
	{
		System.out.println("Đã test xong từng testcase");
	}
	
}