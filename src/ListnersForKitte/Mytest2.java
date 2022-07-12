package ListnersForKitte;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Mytest2 
{
	@Test
	  public void MyMethod4() 
	  {
		  Reporter.log("Hi I am Mymethod4",true);
		  
	  }
	  @Test 
	  public void MyMethod5() 
	  {
		  Assert.fail();
		  Reporter.log("Hi I am Mymethod5",true);
		  
	  }
	  @Test(dependsOnMethods={"MyMethod5"})
	  public void MyMethod6() 
	  {
		  Reporter.log("Hi I am Mymethod6",true);
		  
	  }

}
