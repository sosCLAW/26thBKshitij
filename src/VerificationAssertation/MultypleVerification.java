package VerificationAssertation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultypleVerification {
  @Test
  public void myMethod() 
  {
	  String a="pune1";
	  String b="pune";
	  
	  Assert.assertNotEquals(a, b, "TC is failed values are equal");
	  
	  Assert.assertEquals(a, "TC is failed value is null");
  }
}
