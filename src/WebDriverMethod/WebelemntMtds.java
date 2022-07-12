package WebDriverMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebelemntMtds {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement ram = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(ram);
		s.selectByIndex(1);
		
		
		
	}

}
