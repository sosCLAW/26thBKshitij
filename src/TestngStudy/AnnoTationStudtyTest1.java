package TestngStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudtyTest1 {
  @Test
  public void RechargePhone() 
  {
	  Reporter.log("RechargeDone",true);
  }
  @BeforeMethod
  
	  public void LogInToRechargePortal()
	  {
	  Reporter.log("Login Sucess",true);
	  }
  @AfterMethod
  public void logoutfromrechargemodel()
  {
	  Reporter.log("loged out",true);
  }
  @BeforeClass
  public void launchBrowser()
  {
	  Reporter.log("browser launched",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("browser closed",true);
  }
}
