package iframe;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class framepractis {


	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ui.vision/demo/webtest/frames/");
	
		 
		driver.switchTo().frame(0);	
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("hello");
	
		driver.switchTo().defaultContent();

	    driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello");
	    Thread.sleep(1000);
	    driver.switchTo().defaultContent();
		
     	driver.switchTo().frame(2);
	    driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("yehh from latur");
		
		Thread.sleep(1000);
	
		driver.switchTo().defaultContent();
	
		
		driver.switchTo().frame(3);
	    driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("this is kshitij");
		
        Thread.sleep(1000);
        driver.switchTo().defaultContent();
	   
       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File location=new File("E:\\ScreenShot\\frame.png");
       FileHandler.copy(source, location);
       Thread.sleep(2000);
       driver.quit();
	}

}
