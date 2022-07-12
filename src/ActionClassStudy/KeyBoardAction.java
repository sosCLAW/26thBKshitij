package ActionClassStudy;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		//find element 
       WebElement textbox = driver.findElement(By.id("autocomplete"));
       
       //textbox.sendKeys("good morning kshitij");
       
       // how to send keys by using action class to chalo dekhtehai 
       //1st create object of action class 
       
       Actions act=new Actions(driver);
       act.sendKeys(textbox, "good morning Kshitij ").perform();
       
       // now how to handle drop down by using keybord action class
       
       WebElement dropdown = driver.findElement(By.name("dropdown-class-example"));
       
       // by using action class 
       
       act.click(dropdown).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		WebElement check = driver.findElement(By.name("checkBoxOption1"));
		WebElement check1 = driver.findElement(By.name("checkBoxOption2"));
		WebElement check2 = driver.findElement(By.name("checkBoxOption3"));
		
		act.click(check).perform();
		act.click(check1).perform();
		act.click(check2).perform();
		
		WebElement radio = driver.findElement(By.name("radio"));
		act.click(radio).perform();
		
	}

}
