package popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");
        Thread.sleep(1000);
        
        String mainpageid = driver.getWindowHandle();
        System.out.println(mainpageid);
        System.out.println("///////////////");
        
        
        driver.findElement(By.name("NewWindow")).click();
        Thread.sleep(2000);
        Set<String> allpageid = driver.getWindowHandles();
        Iterator<String>it=allpageid.iterator();
        
     //  while(it.hasNext()) {
      // 	System.out.println(it.next());
       // }
        
         String mainPageid =it.next();//will return main page id
        String childpageid=it.next();
        
        
       driver.switchTo().window(childpageid);
       driver.manage().window().maximize();
       
       driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Selenium");
       Thread.sleep(1000);
       
      driver.switchTo().window(mainPageid);
      
      
      WebElement myElement = driver.findElement(By.xpath("//p[text()='Click below to open link in new tab']"));
        
     	System.out.println(myElement.getText());
       
   
		
        
        
	}

}
