package webtable1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableeg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        Thread.sleep(1000);
        driver.manage().window().maximize();
        
        //how to find no of rows in table
        
       List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr"));
             int totalnoofrows = rows.size();
             System.out.println("total no of rows are " +totalnoofrows);
             
             // to find no of columns in table
             
           List<WebElement> noofcolumns = driver.findElements(By.xpath("//table//tr[1]//th"));
            
             int totalnoofcolumns = noofcolumns.size();
             
             System.out.println("total no of column "+totalnoofcolumns );

	}

}
