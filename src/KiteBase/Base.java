package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;


public class Base 
{       protected WebDriver driver;
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Reporter.log("launching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	public void openBrowserWthFF() throws IOException
	{

		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		
		
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching Browser with FF",true);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		
	}
	
	
}
