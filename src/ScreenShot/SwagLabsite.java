package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class SwagLabsite {

	public static void main(String[] args) throws InterruptedException, IOException  {
	
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		//opening web page 
		driver.get("https://www.saucedemo.com/");
		//locate user name by id
		driver.findElement(By.id("user-name")).sendKeys("performance_glitch_user");
		//locating password by 
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//to click on log in button 
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(10000);
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File location= new File("E:\\ScreenShot\\qwe.png");
        FileHandler.copy(Source, location);
		

	}

}
