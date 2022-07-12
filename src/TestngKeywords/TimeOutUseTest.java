package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;
//TimeOut keyword is used to if test method is time consuming than 
//testNG by default fail that testcase and execute next TESTCASE 
//eg@TEST(timeout=1000)
public class TimeOutUseTest {
  @Test
  public void TC1() 
  {
	  Reporter.log("TC1 IS RUNNING ",true);
  }
  @Test(timeOut=2000)
  public void TC2() 
  {
	  Reporter.log("TC2 IS RUNNING ",true);
  }
  @Test
  public void TC3() 
  {
	  Reporter.log("TC3 IS RUNNING ",true);
  }
  
  
}
