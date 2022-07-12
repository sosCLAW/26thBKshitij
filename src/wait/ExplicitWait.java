package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[]args)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));
		
		WebElement aboutus = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		
		
		wait.until(ExpectedConditions.visibilityOf(aboutus));
		aboutus.click();
		
		
		
		
	}

}
