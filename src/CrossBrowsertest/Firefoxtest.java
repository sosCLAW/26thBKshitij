package CrossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefoxtest {
  @Test
  public void myMethod() 
  {
	  System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe.");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");

  }
}
