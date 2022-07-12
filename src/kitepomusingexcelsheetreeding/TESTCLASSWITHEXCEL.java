package kitepomusingexcelsheetreeding;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMwithkiteApp.KIteLoginPage;
import POMwithkiteApp.KitePinPage;
import POMwithkiteApp.kitehomepage;

public class TESTCLASSWITHEXCEL {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		File myfile=new File("D:\\Excel\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		
		String UN =mysheet.getRow(0).getCell(0).getStringCellValue();
		String pass =mysheet.getRow(1).getCell(0).getStringCellValue();
		String PIN =mysheet.getRow(2).getCell(0).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
	    Thread.sleep(1000);
		
		KIteLoginPage login=new KIteLoginPage(driver);
		
		
		login.sendUserName();
		login.sendPassword();
		login.clickloginbutton();
		
	    Thread.sleep(1000);
	    
	    KitePinPage pin =new KitePinPage(driver);
	    pin.sendpin();
	    pin.continuebutton();
	    
	    Thread.sleep(1000);
	    kitehomepage home=new kitehomepage(driver);
	    home.validateUsername();
	    home.logout();
	    
	    System.out.println(UN);
	    System.out.println(pass);
	    System.out.println(PIN);
	    



		
		
	}

}
