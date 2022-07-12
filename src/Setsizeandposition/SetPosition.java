package Setsizeandposition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		
		// to set position we need to create object of point class and pass x and y coordinates 
		Point p=new Point(200,100);
		//using setposition mtd we can set position of browser position 
		driver.manage().window().setPosition(p);

       
	}

}
