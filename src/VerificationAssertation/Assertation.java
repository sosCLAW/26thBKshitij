package VerificationAssertation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertation {
  @Test
  public void mymethod() 
  {
	 
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://vctcpune.com/selenium/practice.html");
           
			WebElement radioButton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
			
			Assert.assertTrue(radioButton1.isSelected(),"Radio button is not selected Tc is failed");

  }
}
