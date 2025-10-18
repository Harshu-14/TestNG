package day5;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenersTestMethods implements ITestListeners {

	public void onTestStart(ITestResult result)
	{
        System.out.println("Now the Test Method Execution Started:" +result.getName());
    }

	public void onTestSuccess(ITestResult result)
	{
        System.out.println("Now the Test Method Passed:" +result.getName());
    }

	public void onTestFailure(ITestResult result)
	{
        System.out.println("Test Method is Failed:" +result.getName());
    }

	public void onTestSkipped(ITestResult result)
	{
        System.out.println("Test Method is Skipped:" +result.getName());
    }

	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
        //not implemented
    }

	public void onTestFailedWithTimeout(ITestResult result)
	{
        onTestFailure(result);
    }


	public void onStart(ITestContext context)
	{
        System.out.println("Now Execution Started");
    }

	public void onFinish(ITestContext context)
	{
        System.out.println("Execution Completed");
    }

}








