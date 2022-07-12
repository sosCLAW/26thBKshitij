package miscellinious;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOofimagesonbrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\\\selenium\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?sxsrf=ALiCzsYrP5Co2_nvYGhNwBglhtjBqb8xIQ:1654791341635&source=hp&ei=rRyiYpnVJIG8hwP5uLboAg&iflsig=AJiK0e8AAAAAYqIqvYbGk_Sw23PuMyoJe2WZYPO5P3W-");
        driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"sbtc\"]/div/div[2]/input")).sendKeys("toyota supraa m4");
        driver.findElement(By.xpath("//*[@id=\"sbtc\"]/button")).click();
        Thread.sleep(1000);
        List<WebElement> search = driver.findElements(By.tagName("img"));
        System.out.println(search.size());
        Thread.sleep(1000);
        
        
		for(WebElement r:search)
		{
			System.out.println(r.getText());
		}
        
        for(WebElement k:search)
        {
        	String actualtext = k.getText();
        	String expectedtext = "toyota supraa m4";
        	
        	if(actualtext.equals(expectedtext))
        	{
        		k.click();
        		break;
        	}
        }
        
       
	}

}
