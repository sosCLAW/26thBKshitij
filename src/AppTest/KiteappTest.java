package AppTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteappTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		 WebElement USERID = driver.findElement(By.id("userid"));
		 WebElement PASS = driver.findElement(By.id("password"));
		 WebElement LOGIN = driver.findElement(By.xpath("//button[@type='submit']"));
		
		 
		 USERID.sendKeys("ELR321");
		 PASS.sendKeys("Dhana1111");
		 LOGIN.click();
		 Thread.sleep(1000);
		 
		 WebElement PIN = driver.findElement(By.id("pin"));
		 PIN.sendKeys("982278");
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

		 driver.close();
		

	}

}
