package Mypractise;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practiase {

	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://groww.in/login/enter");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String s= RandomString.make(3);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File("E:\\ScreenShot\\money"+s+".png");
		FileHandler.copy(source, location);
	
		driver.quit();
		
	}

}
