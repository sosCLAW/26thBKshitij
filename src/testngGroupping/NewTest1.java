package testngGroupping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test(groups= {"regression"})
  public void TC1() 
  {
	  Reporter.log("TC1 IS RUNNING ",true);
  }
  @Test(groups= {"regression"})
  public void TC2() 
  {
	  Reporter.log("TC2 IS RUNNING ",true);
  }
  @Test(groups= {"sanity"})
  public void TC3() 
  {
	  Reporter.log("TC3 IS RUNNING ",true);
  }
  @Test(groups= {"sanity"})
  public void TC4() 
  {
	  Reporter.log("TC4 IS RUNNING ",true);
  }
}
