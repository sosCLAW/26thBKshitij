package KiteTest;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;
import KitePomnew.KIteLoginPage;
import KitePomnew.KitePinPage;
import KitePomnew.kitehomepage;
import Utilityclass.Utility;

public class ValidateUserid extends Base{
 kitehomepage home;
   KIteLoginPage login;
      KitePinPage pin;
	   String TCID="1234";
	
	@BeforeClass
	public void launchbrowser()
	{
		openbrowser();
		login=new KIteLoginPage(driver);
	         	pin=new KitePinPage(driver);
		           home= new kitehomepage(driver);
	}
	@BeforeMethod
	public void logintokiteapp() throws EncryptedDocumentException, IOException
	{
		login.sendUserName(Utility.readdatafromexcel(0, 0));
		login.sendPassword(Utility.readdatafromexcel(1, 0));
		login.clickloginbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendpin(Utility.readdatafromexcel(2, 0));
		pin.continuebutton();
	}
	
	@Test
  public void validateUserId() throws EncryptedDocumentException, IOException 
  {
	  Assert.assertEquals(home.getactualusername(), Utility.readdatafromexcel(0, 0),"Actual and expected are not match TC is fail");
	  Utility.capturescreenshot(driver, TCID);
  }
	@AfterMethod
	public void logout() throws InterruptedException
	{
		home.logout();
	}
  @AfterClass
  public void closeBrowser() throws InterruptedException
  {
	  Thread.sleep(100);
  }
  
}
