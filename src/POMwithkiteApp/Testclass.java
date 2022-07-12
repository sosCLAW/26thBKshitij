package POMwithkiteApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
	    Thread.sleep(1000);
		
		KIteLoginPage login=new KIteLoginPage(driver);
		
		
		login.sendUserName();
		login.sendPassword();
		login.clickloginbutton();
		
	    Thread.sleep(1000);
	    
	    KitePinPage pin =new KitePinPage(driver);
	    pin.sendpin();
	    pin.continuebutton();
	    
	    Thread.sleep(1000);
	    kitehomepage home=new kitehomepage(driver);
	    home.validateUsername();
	    home.logout();
	    


		
		
	}

}
