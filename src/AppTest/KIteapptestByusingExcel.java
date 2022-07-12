package AppTest;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KIteapptestByusingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		File myfile=new File("D:\\Excel\\Book1.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet5");
		String Un = mysheet.getRow(0).getCell(0).getStringCellValue();
		String pwd = mysheet.getRow(1).getCell(0).getStringCellValue();
		String pin= mysheet.getRow(2).getCell(0).getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement USERID = driver.findElement(By.id("userid"));
		 WebElement PASS = driver.findElement(By.id("password"));
		 WebElement LOGIN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		 
		 USERID.sendKeys(Un);
		 PASS.sendKeys(pwd);
		 LOGIN.click();
		 Thread.sleep(1000);
		 
		 WebElement PIN = driver.findElement(By.id("pin"));
		 PIN.sendKeys(pin);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 Thread.sleep(1000);
		 

		 WebElement USERNAME = driver.findElement(By.xpath("//span[@class='user-id']"));
		 String actualusername = USERNAME.getText();
		 String expecteduserid = "ELR321";
		 
		 if(actualusername.equals(expecteduserid))
		 {
			 System.out.println("user id matched and test case is pass");
		 }
		 else {
			 System.out.println("user id not matched test case is fail");
		 }
		 USERNAME.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[@target='_self']")).click();
		 Thread.sleep(1000);

		
		

		
		
		
		
		
		

	}

}
