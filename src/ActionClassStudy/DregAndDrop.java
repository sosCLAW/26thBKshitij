package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DregAndDrop {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
	
		Thread.sleep(1000);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		//now find source and Destination
		WebElement Source = driver.findElement(By.id("fourth"));
		
		WebElement Destination = driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		//aata Drag and drop ksaa waprychaa pahu 
		//create object of action class
		
		Actions act= new Actions(driver);
		
		// By using actin class drag and drop is performed
		// act.moveToElement(Source).clickAndHold().moveToElement(Destination).release().build().perform();
		 act.dragAndDrop(Source, Destination).perform();
		
	
		 
		 
		WebElement ss = driver.findElement(By.id("fourth"));
		WebElement dd= driver.findElement(By.id("amt7"));
		
		act.moveToElement(ss).clickAndHold().moveToElement(dd).release().build().perform();

	}

}
