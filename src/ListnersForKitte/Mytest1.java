package ListnersForKitte;


import org.testng.Assert;
import org.testng.Reporter;import org.testng.annotations.Test;
//@Listeners(ListnersForKitte.Listeners.class)
public class Mytest1 {
@Test
  public void MyMethod1() 
  {
	  Reporter.log("Hi I am Mymethod1",true);
	  
  }
  @Test 
  public void MyMethod2() 
  {
	  Assert.fail();
	  Reporter.log("Hi I am Mymethod2",true);
	  
  }
  @Test(dependsOnMethods={"MyMethod2"})
  public void MyMethod3() 
  {
	  Reporter.log("Hi I am Mymethod3",true);
	  
  }
   
}
