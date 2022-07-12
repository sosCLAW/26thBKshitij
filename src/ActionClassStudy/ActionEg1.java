package ActionClassStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEg1 {
            public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

		
			driver.manage().window().maximize();
			driver.get("https://demo.guru99.com/test/simple_context_menu.html");
			@SuppressWarnings("unused")
			WebElement SeliniumButton = driver.findElement(By.linkText("Selenium"));
			//SeliniumButton.click();
			
			//Now how to click using action class
		    // Create object of action class and pass driver object
             Actions act = new Actions (driver);
             
             // using onethe required action complete the process (yevdhya type ahet button action class ne click krychya )
             // act.moveToElement(SeliniumButton).perform();
              // act.click().perform();
             // act.moveToElement(SeliniumButton).click().build().perform();
             // act.click(SeliniumButton).perform();
             
            //How to right click or context click by using action class 
             
            WebElement rightclickButton = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
            
              act.moveToElement(rightclickButton).contextClick().build().perform();
             // act.contextClick(rightclickButton).perform();
            
             // ataa double click kse kryche te pahu bro
             WebElement DoubleclickButtion = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button")); 
             
            // act.moveToElement(DoubleclickButtion).doubleClick().build().perform();
             act.doubleClick(DoubleclickButtion).perform();
             
         
            
             
             
		

	}

}
