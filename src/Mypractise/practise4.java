package Mypractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise4 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
	
    WebDriver driver =new ChromeDriver();
    driver.get("https://www.qspiders.com/");
    driver.manage().window().maximize();
   Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[1]/nav/div[2]/div[2]/a[8]/span[2]")).click();
    Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/span/form/div[1]/span/div/div/input")).sendKeys("rushi");
  Thread.sleep(100);
  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/span/form/div[2]/span/div/div/input")).sendKeys("8888");
  Thread.sleep(100);
  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/span/form/div[3]/span/div/input")).sendKeys("qwerty@123.com");
  Thread.sleep(100);
  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/span/form/div[4]/div[1]/textarea")).sendKeys("hi i am bmwm4");
  Thread.sleep(100);
  driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/div[2]/div/div[2]/div/div/div/div/div/span/form/div[4]/div[2]/button")).click();
  
  Thread.sleep(1000);
  driver.quit();
	}

}
