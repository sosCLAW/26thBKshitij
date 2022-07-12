package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fbexample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.partialLinkText("Create New Account")).click();
	    
		Thread.sleep(5000);
		
        driver.findElement(By.name("firstname")).sendKeys("kshitij");
        
        Thread.sleep(5000);
        
        driver.findElement(By.name("lastname")).sendKeys("Kharolkar");
        
        Thread.sleep(5000);
        
        driver.findElement(By.name("reg_email__")).sendKeys("8554012070");
        
        Thread.sleep(5000);
        
        driver.findElement(By.name("reg_passwd__")).sendKeys("121212");
        
        Thread.sleep(5000);
        
       WebElement divas = driver.findElement(By.id("day"));
       
       Actions act= new Actions(driver);
       
       act.click(divas).perform();
       
       for (int i=1; i<=10;i++) {
    	   
    	   act.sendKeys(Keys.ARROW_DOWN).perform();
    	   Thread.sleep(500);
       }
        act.sendKeys(Keys.ENTER).perform();
        
    
        
        
        WebElement mahina = driver.findElement(By.name("birthday_month"));
       
       act.click(mahina).perform();
       
       for(int a=1; a<=5; a++) {
    	   act.sendKeys(Keys.ARROW_DOWN).perform();
    	   Thread.sleep(500);
       }
        act.sendKeys(Keys.ENTER).perform();
        
       
        
        WebElement varsh = driver.findElement(By.id("year"));
        
        act.click(varsh).perform();
        
        for(int b=1; b<=27; b++) {
        	act.sendKeys(Keys.ARROW_DOWN).perform();
        	Thread.sleep(500);
        }
        act.sendKeys(Keys.ENTER).perform();
        
        Thread.sleep(5000);
        
       // driver.findElement(By.id("u_4_5_LP")).click();
        //Thread.sleep(100);
        
        
       System.out.println("test is completed successfully");
       
       
      

	}

}
