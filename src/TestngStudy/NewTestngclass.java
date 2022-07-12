package TestngStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTestngclass {
  @Test
  //1.

	public void test1() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","\"E:\\selenium\\chromedriver.exe\"");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		Reporter.log("Kshitij is doing testing)",true);
		System.out.println("yes im here");
		
		
	}
  
  
  @Test
  //2.
	
  public void test2() throws InterruptedException
  {
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
		 
		 Reporter.log("Kshitij)",true);
		 
  }
}
