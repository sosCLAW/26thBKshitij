package VerificationAssertation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsUse {
  @Test
  public void myMethod() 
  {
	  String a="latur";
	  String b="latur";
	  
	  Assert.assertNotEquals(a, b,"a and b values are matching TC failed ");
	  Reporter.log(" a and b values are not matching TC passed",true);
  }
}
