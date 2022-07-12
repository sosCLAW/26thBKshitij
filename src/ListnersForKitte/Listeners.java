package ListnersForKitte;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Basenew;

public class Listeners extends Basenew implements ITestListener
{
	
	Basenew b= new Basenew();
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("screenshot taken plz check TC it is failed ",true);
		Reporter.log("Failed testcase name is "+result.getName(),true);
		String name = result.getName();
		try {
			b.capturescreenshot(driver, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	
	{
		Reporter.log("TC is passed ",true);
		Reporter.log("passed testcase name is "+result.getName(),true);

	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(" TC is skipped ",true);
		Reporter.log("skipped testcase name is "+result.getName(),true);

	}
	

}
