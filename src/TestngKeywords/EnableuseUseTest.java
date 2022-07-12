package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//Enabled KEYWORD use it is used to disabling the test method BOOLIAN VALUE ARE 
//MAINTAIONED  eg.enablesd=false

//TC bole to TEST CASE
public class EnableuseUseTest {
  @Test(enabled=true)
  public void TC1() 
  {
	  Reporter.log("TC1 IS RUNNING ",true);
  }
  @Test(enabled=false)
  public void TC2() 
  {
	  Reporter.log("TC2 IS RUNNING ",true);
  }
  @Test(enabled=true)
  public void TC3() 
  {
	  Reporter.log("TC3 IS RUNNING ",true);
  }
  @Test(enabled=false)
  public void TC4() 
  {
	  Reporter.log("TC4 IS RUNNING ",true);
  }
}
