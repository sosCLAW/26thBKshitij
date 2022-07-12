package KITEpomUsingTESTNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import KiteBase.Basenew;
import kitepomusingexcelsheetreeding.Kiteloginpage;
@org.testng.annotations.Parameters("BrowserName")

public class validatekiteappUsername extends Basenew{
	WebDriver driver;
	Sheet mysheet;
	kitehomepage home;
    KitePinPage pin;
	Kiteloginpage login;
	
@BeforeClass
public void launchBrowser(@Optional String Name) throws EncryptedDocumentException, IOException 
{
 if (Name.equals("Chrome"))
 {
	 openBrowserWithChrome();
 }
 else if (Name.equals("FF")) 
 {
	 openBrowserWthFF();
 }
 
	//ChromeOptions opt= new ChromeOptions();
	//opt.addArguments("--headless");
	//op.addArguments("--disable-notifications");
	//opt.addArguments("version");
	//driver=new ChromeDriver(opt);
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	Reporter.log("launching Browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	File myfile=new File("D:\\Excel\\Book1.xlsx");
	mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
	
	login =new Kiteloginpage(driver);
	pin = new KitePinPage(driver);
	home= new kitehomepage(driver);
	
	
	
	
}
@BeforeMethod
public void logintoKiteApp()
{
	String UN =mysheet.getRow(0).getCell(0).getStringCellValue();
	String pass =mysheet.getRow(1).getCell(0).getStringCellValue();
	String PIN =mysheet.getRow(2).getCell(0).getStringCellValue();
	

	login.sendUserName(UN);
	Reporter.log("Sending UN..... ",true);

	login.sendPassword(pass);
	Reporter.log("Sending PASS..... ",true);

	login.clickloginbutton();
	Reporter.log(" click login button ",true);
	

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendpin(PIN);
	Reporter.log("Sending PIN..... ",true);
	pin.continuebutton();
	Reporter.log(" click continue button ",true);

	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	

	
	
}
 @Test
 public void validateUsername() 
 {
		String expectedUN =mysheet.getRow(0).getCell(0).getStringCellValue();
		String actualUN = home.getactualusername();
		Assert.assertEquals(actualUN,expectedUN,"Actual and Expected is not matching TC fail");

		Reporter.log("actualUN and expectedUN are matching Tc passed",true); 	 
	  
 }
 @AfterMethod
 public void logoutFromKiteapp() throws InterruptedException
 {   
	 home.logout();
		Reporter.log(" click logout button ",true);

 }
 @AfterClass
 public void closeBrowser() throws InterruptedException
 {
	 Thread.sleep(100);
		Reporter.log(" closing Browser ",true);

 }
}
