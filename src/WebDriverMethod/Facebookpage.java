package WebDriverMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Facebookpage {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\\\\\\\selenium\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		driver.findElement(By.name("firstname")).sendKeys("kshitij");
		driver.findElement(By.name("lastname")).sendKeys("Kharolkar");
		driver.findElement(By.name("reg_email__")).sendKeys("8793917772");
		driver.findElement(By.id("password_step_input")).sendKeys("qwerty@123");
		WebElement day = driver.findElement(By.id("day"));
        Select d= new Select(day);
        d.selectByIndex(16);
        Thread.sleep(1000);
		WebElement may = driver.findElement(By.id("month"));
		Select month=new Select(may);
		month.selectByIndex(4);
		Thread.sleep(2000);
		WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
		Select y= new Select(Year);
		y.selectByValue("1996");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("websubmit")).click();
		
		

       File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
       File location=new File("E:\\ScreenShot\\rty.png");
       FileHandler.copy(source, location);
       
		System.out.println("test is succesfully completed ");

	}

}
