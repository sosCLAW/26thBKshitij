package WebDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriverAllMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//use of web driver get method
		driver.get("https://meet.google.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/search?q=google&oq=google&aqs=chrome..69i57j46i39i199i465j0i67i131i433j0i67i433l2j0i67i131i433i457j0i402l2j0i67i433.2224j0j15&sourceid=chrome&ie=UTF-8");
		
        driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		driver.manage().window().minimize();
		Thread.sleep(10000);
		driver.quit();
	}

}
