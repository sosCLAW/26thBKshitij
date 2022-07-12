package KiteBase;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import Utilityclass.Utilityprop;

public class Basenew {
	static public  WebDriver driver;
	public void openBrowserWithChrome() throws IOException 
	{

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--disable-notifications");
		
		
		
		driver=new ChromeDriver();
		driver.get(Utilityprop.getDataFromPropertyFile("URL"));
		Reporter.log("launching Browser with Chrome",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	public void openBrowserWthFF() throws IOException
	{

		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("--disable-notifications");
		
		
		
		System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
		 driver=new FirefoxDriver();
		driver.get(Utilityprop.getDataFromPropertyFile("URL"));
		Reporter.log("launching Browser with FF",true);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

		
	}
	public  void capturescreenshot(WebDriver driver , String TCID) throws IOException
	{
	   File src=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest= new File("E:\\ScreenShot\\Mysc"+TCID+".png");
	   FileHandler.copy(src, dest);
			
	}
    
}
