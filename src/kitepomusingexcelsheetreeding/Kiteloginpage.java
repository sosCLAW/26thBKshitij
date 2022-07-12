package kitepomusingexcelsheetreeding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
	//1. DATA MEMBERS 	
		@FindBy(id="userid")private WebElement userName;
		@FindBy(id="password")private WebElement password;
		@FindBy(xpath="//button[@type='submit']")private WebElement loginbutton;
		
		
		
		//2. constructor
		
		public Kiteloginpage(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		//3. Methods 
		public void sendUserName(String UN)
		{
			userName.sendKeys(UN);
		}
		
	    public void sendPassword(String PWD)
	    {
		     password.sendKeys(PWD);
		     
	    }
	    
	    public void clickloginbutton()
	    {
	    	loginbutton.click();
	    }
		
		
		
		


}
