package Scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPractise {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement radio2 = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		JavascriptExecutor k=(JavascriptExecutor)driver;
		k.executeScript("arguments[0].scrollIntoView(true)",radio2);
		radio2.click();
		
		Thread.sleep(1000);
		WebElement sugg = driver.findElement(By.id("autocomplete"));
		JavascriptExecutor l=(JavascriptExecutor)driver;
		l.executeScript("arguments[0].scrollIntoView(true)",sugg);
		sugg.sendKeys("WELCOME");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Thread.sleep(1000);
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor m=(JavascriptExecutor)driver;
		m.executeScript("arguments[0].scrollIntoView(true)",name);
		name.sendKeys("KSHITIJ");
		
		
		Thread.sleep(1000);
		WebElement hide = driver.findElement(By.className("btn-style class2"));
		JavascriptExecutor o=(JavascriptExecutor)driver;
		o.executeScript("arguments[0].scrollIntoView(true)",hide);
		hide.click();
		
		
		
		
		
		
	}

}
