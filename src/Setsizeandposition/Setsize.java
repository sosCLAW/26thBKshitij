package Setsizeandposition;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		
		System.out.println(driver.manage().window().getSize());
		
		// to set size create object of dimension class and pass width and height
		
		Dimension d= new Dimension (111,200);
		driver.manage().window().setSize(d);


	}

}
