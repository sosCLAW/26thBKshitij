package Utilityclass;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteBase.Basenew;

public class Listeners extends Basenew implements ITestListener  
{
WebDriver driver;
Basenew b= new Basenew();
	@Override
	public void onTestSuccess(ITestResult result)
	{
	Reporter.log("yes your TC is passed ,tc name is "+result.getName(),true);
	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		Reporter.log("sry your TC is failed ,tc name is "+result.getName(),true);
		String name = result.getName();
		try {
              b.capturescreenshot(driver, name);} catch (IOException e) {}

	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(" your TC is skipped ,tc name is "+result.getName(),true);

	}
	
	
	
}
