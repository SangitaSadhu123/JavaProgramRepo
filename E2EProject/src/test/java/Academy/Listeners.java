package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import resources.Base;
import resources.ExtentReporterNG;

public class Listeners extends Base implements ITestListener {
	public ExtentTest test;
	ExtentReports extent=ExtentReporterNG.getReportObject();	// calling created Extent Report methods
	ThreadLocal<ExtentTest> ext=new ThreadLocal<ExtentTest>(); // using ThreadLocal making framework as thread safe sothat we can avoid overried problem of test instance
	
	
	
	
	public void onTestStart(ITestResult result)  // before executing of test methods this onTestStart will execute 1st which will help to create report of each test methods
	
	{
		//call createTest () of ExtentReports class to create test instance which unique for every test method using that can use in every listener’s override methods 
		test=extent.createTest(result.getMethod().getMethodName()); 
																	// result.getMethod().getMethodName() - will give test case/method name
		
		ext.set(test);                                       // so putting all the test into ext of ThreadLocal then we will call
		                                                            // one by one test instance from ext
	}

	public void onTestSuccess(ITestResult result) {
		
		ext.get().log(Status.PASS," Test passed "); 
	}
	
	
// wherever ant test fail control will come to this block and capture the failure
	public void onTestFailure(ITestResult result) 
	{
		ext.get().fail(result.getThrowable()); // using getThrowable() will get the logs 
		
		WebDriver driver=null;
		//calling screenshots method whenever test will get failed
		
		String testMethodName=result.getMethod().getMethodName();//help to get test method name like which test method is getting failed
		
		//passing the filed of test methods which is object of webDriver so create a dummy webDriver so with this driver filed dummy webDriver will get live
		
		try {
			
			driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		} 
		
		 
		try {
			//addScreenCaptureFromPath() is use to integrate sceenshot path with extent report so that can see failed test case's screenshot
			ext.get().addScreenCaptureFromPath(getScreenShot(testMethodName,driver),result.getMethod().getMethodName()); //getScreenShot() calling screenshot method
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		extent.flush(); // allow to fetch reports after running all test methods
	}
	
	
	

}
