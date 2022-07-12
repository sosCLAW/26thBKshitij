package TestngKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonMethods 
//DependsOnmethods keyword is used when one test case is depends upon another so 
//we need to use this Keyword eg. dependson=("TC name")



{
	@Test
	public void TC1() 
	  {
		  Reporter.log("TC1 IS RUNNING ",true);
	  }
	  @Test(dependsOnMethods="TC1")
	  public void TC2() 
	  {
		  Reporter.log("TC2 IS RUNNING ",true);
	  }
}
