package testngGroupping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups= {"sanity"})
  public void a() 
  {
	  Reporter.log("test case a is passed ",true);
  }
  @Test(groups= {"sanity"})
  public void b() 
  {
	  Reporter.log("test case b is passed ",true);
  }
  
  @Test(groups= {"regression"})
  public void c() 
  {
	  Reporter.log("test case c is passed ",true);
  }
  @Test(groups= {"regression"})
  public void d() 
  {
	  Reporter.log("test case d is passed ",true);
  }
  
}
