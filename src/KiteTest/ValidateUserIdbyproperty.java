package KiteTest;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import KiteBase.Basenew;
import KitePomnew.KIteLoginPage;
import KitePomnew.KitePinPage;
import KitePomnew.kitehomepage;
import Utilityclass.Utilityprop;
@Listeners(ListnersForKitte.Listeners.class)

public class ValidateUserIdbyproperty extends Basenew 
{
	kitehomepage home;
	KIteLoginPage login;
    KitePinPage pin;
		  // String TCID="545";
	      @org.testng.annotations.Parameters("BrowserName")

		@BeforeClass
		public void launchbrowser(@Optional String Name) throws IOException
		{if (Name.equals("Chrome"))
		 {
			 openBrowserWithChrome();
		 }
		 else if (Name.equals("FF")) 
		 {
			 openBrowserWthFF();
		 }
			
		
		}
		@BeforeMethod
		public void logintokiteapp() throws IOException, InterruptedException 
		{Thread.sleep(1000);
		login=new KIteLoginPage(driver);
	    pin=new KitePinPage(driver);
		 home= new kitehomepage(driver);
			login.sendUserName(Utilityprop.getDataFromPropertyFile("UN"));
			login.sendPassword(Utilityprop.getDataFromPropertyFile("PASS"));
			login.clickloginbutton();
			
			pin.sendpin(Utilityprop.getDataFromPropertyFile("PIN"));
			pin.continuebutton();
			
		}
		
		@Test
	  public void validateUserId() throws IOException  
	  {
			Assert.assertEquals(home.getactualusername(),Utilityprop.getDataFromPropertyFile("UN"));
			Assert.fail();
	  }
		@AfterMethod
		public void logout() throws InterruptedException 
		{
		
		}
	  @AfterClass
	  public void closeBrowser()
	  {
	  }
	  

}
