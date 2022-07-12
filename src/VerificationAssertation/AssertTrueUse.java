package VerificationAssertation;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueUse {
  @Test
  public void mymethod () 
  {boolean a=true;
  boolean b=false;
  
 // Assert.assertTrue(b,"tc is failed value is false");
 // Reporter.log("Tc is passed value is false ",true);
  
  Assert.assertTrue(a,"tc is failed value is true");
  Reporter.log("Tc is passed value is false ",true);
  
  }
}
