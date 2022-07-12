package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountuse {
	
	
	//invocationCount= THIS KEYWORD IS USED TO EXCUTE TEST CASE MULTYPLE TIME  
	 @BeforeMethod
	  public void test()
	  {
		  Reporter.log("BeforeMethodRunning",true);
	  }
	
	@Test(invocationCount=2)
  public void myTest() 
  {
	  Reporter.log("Hello",true);
  }
 
  
} 
