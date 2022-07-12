package KITEpomUsingTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	//1.Data Members 
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	
	//2 constructor 
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. METHODS	
	
	public void sendpin (String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void continuebutton()
	{
		continuebutton.click();
	}


	
		
	

}
