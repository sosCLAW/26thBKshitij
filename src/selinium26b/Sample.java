package selinium26b;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("https://vctcpune.com/selenium/practice.html");
    driver.manage().window().maximize();
    
	//find element by using id locator
    WebElement searchc = driver.findElement(By.id("autocomplete"));
	searchc.sendKeys("this is ram");
	Thread.sleep(1000);
	// find elemnt by xpath by atribute 
	driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("i am kshiij");
	Thread.sleep(1000);
	
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(1000);
	String title = driver.getTitle();
	System.out.println(title);
	
	
	WebElement radioR3 = driver.findElement(By.xpath("//input[@value='Radio3']"));
	
	radioR3.click();
	System.out.println("radio button R3 is selected = "+radioR3.isSelected());
	
	
	
 
	driver.manage().window().minimize();
       }
}