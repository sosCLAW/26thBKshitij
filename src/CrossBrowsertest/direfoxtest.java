package CrossBrowsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class direfoxtest
{
  public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://vctcpune.com/selenium/practice.html");
	
}
  
  
  
}
