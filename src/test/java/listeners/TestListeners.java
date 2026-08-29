package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import junit.framework.TestListener;

public class TestListeners implements ITestListener{
	public static final Logger logger = LogManager.getLogger(TestListener.class);
	
	 public void onTestStart(ITestResult result) {
		   logger.info("Test Suite Started!");
	 }
	 
	 public void onTestSuccess(ITestResult result) {
		 logger.info("Success!:"+result.getMethod().getMethodName());
		 logger.info("Description:"+result.getMethod().getDescription());
		    
	 }
	 
	 public void onTestFailure(ITestResult result) {
		 logger.error("Success!"+result.getMethod().getMethodName());
	 }
	 
	 public void onTestSkipped(ITestResult result) {
		 logger.info("Skipped!"+result.getMethod().getMethodName());
	 }
	 
	 public void onTestFailedWithTimeout(ITestResult result) {
		    onTestFailure(result);
	 }
	 
	 public void onStart(ITestContext context) {
		   logger.info("Test Suite Started");
	 }
	 
	 public void onFinish(ITestContext context) {
		   logger.info("Test Suite Completed");
	 }
}
