package KitePomnew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage {

//1. data members
	@FindBy(xpath = "//span[@class='user-id']")private WebElement username;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutbutton;
	
	
	
	//2. CONSTRUCTOR
	public kitehomepage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}
    
	
	 //3.METHODS
	
	public void validateUsername() 
	{
		String expectedUserName="ELR321";
		
		String ActualUserName=username.getText();
		
		if(expectedUserName.equals(ActualUserName))
		{
			System.out.println("Actual and expected user id are matched TC is passed");
		}
		else {
			System.out.println("Actual and expected user id are not matched TC is failed");
		     }
		
	}
	
	// to get actual user name 
	
	public String getactualusername()
	{
	  	String actualUsername = username.getText();
	  	return actualUsername;
	}
	
	public void logout() throws InterruptedException 
	{
		username.click();
		Thread.sleep(100);
		logoutbutton.click();
	}

}
