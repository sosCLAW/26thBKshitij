package TestngStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnoTationStudty {
  @Test
  public void ValidateUserId()
  {
	  Reporter.log("UserIdValidated",true);
  }
  @Test
  public void validateDashboard()
  {
	  Reporter.log("DashBoardValidated",true);
  }
  @BeforeMethod
  public void LoginToKiteApp() 
  {
	  Reporter.log("LoginSuccess",true);
  }
  @BeforeClass
  public void LaunchBrowser() 
  {
	  Reporter.log("Browserlaunchedsuccessfully",true);
  }
  @AfterMethod
  public void LogOutFromKiteApp()
  {
	  Reporter.log("Logedout.....",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Browser closed",true);
  }
}
