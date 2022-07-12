package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramePractise2 {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		String text = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		System.out.println(text);
		
		
		driver.switchTo().frame("frame1");
		String text1 = driver.findElement(By.id("topic")).getText();
		System.out.println(text1);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
		driver.switchTo().frame("frame2");
		WebElement str3=driver.findElement(By.className("col-lg-3"));
		Select s=new Select(str3);
		System.out.println(s.isMultiple());
		s.selectByIndex(3);
		s.selectByVisibleText("Big Baby Cat");


		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame1");
		String text3 = driver.findElement(By.id("topic")).getText();
		System.out.println(text3);
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		
		String text4 = driver.findElement(By.xpath("//h1[@class='breadcrumb-item']")).getText();
		System.out.println(text4);
		

		
	}

}
