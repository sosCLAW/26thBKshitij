package Mypractise;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practise2 {

	public static void main (String [] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://10fastfingers.com/typing-test/english");
		driver.manage().window().maximize();
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File("E:\\ScreenShot\\Typing.png");
		FileHandler.copy(source, location);
		
		String text = driver.findElement(By.className("control-label")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
	}
	
}
