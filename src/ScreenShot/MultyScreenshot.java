package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MultyScreenshot {
	
	public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spotify.com/in-en/free/?utm_source=in-en_brand_contextual_text&utm_medium=paidsearch&utm_campaign=alwayson_asia_in_premiumbusiness_core_brand_neev+contextual+in-en+google&gclid=Cj0KCQjwheyUBhD-ARIsAHJNM-O2y6DKH0Gm28S49Hoy-sLD_8N_Y3E2kXpljd4pMxp8dTeKwkBnEgQaAmOhEALw_wcB&gclsrc=aw.ds");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String s= RandomString.make(3);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File("E:\\ScreenShot\\money"+s+".png");
		FileHandler.copy(source, location);
	
		driver.quit();
	}
}
