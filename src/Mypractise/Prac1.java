package Mypractise;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac1 {
public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.w3schools.com/css/css_tooltip.asp");
	Thread.sleep(1000);
	
	String mainid = driver.getWindowHandle();
	
	System.out.println(mainid);
	
	driver.findElement(By.linkText("Try it Yourself »")).click();
	Thread.sleep(1000);
	
	driver.findElement(By.linkText("Try it Yourself »")).click();
	Thread.sleep(1000);
	
	
	driver.findElement(By.linkText("Try it Yourself »")).click();
	Thread.sleep(1000);
	
	Set<String> multyid = driver.getWindowHandles();
	System.out.println(multyid);
	
	for (String a:multyid)
	{
		System.out.println(a);
	
	if (!a.equals(mainid))
	{
		driver.switchTo().window(a);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
		
	}
	driver.switchTo().window(mainid);
	Thread.sleep(1000);
	
	String aa = driver.findElement(By.className("color_h1")).getText();
	System.out.println(aa);
	
		
	
	}
}
}
