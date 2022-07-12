package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

//PRIORITY key word is use to execute test case on priority it can be +ve 
//-ve , default ,duplicate 

public class PriorityUse {
  @Test(priority=-1)
  public void d()
  {
	  Reporter.log("d is running",true);
  }
  @Test(priority=1)
  public void a()
  {
	  Reporter.log("a is running",true);
  }
  @Test(priority=-2)
  public void v()
  {
	  Reporter.log(" yes im V prior  is running",true);
  }
  @Test(priority=-5)
  public void z()
  {
	  Reporter.log(" yes im z prior  is running",true);
  }
  @Test(priority=-4)
  public void x()
  {
	  Reporter.log(" yes im x prior  is running",true);
  }
  @Test(priority=-3)
  public void q()
  {
	  Reporter.log(" yes im q prior  is running",true);
  }

}
