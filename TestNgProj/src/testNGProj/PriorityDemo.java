package testNGProj;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class PriorityDemo {
  @Test
  public void Reg() {
  System.out.println("B Test Case");
  }
  @Test(priority=0)
  public void Login() {
	System.out.println("A Test Case");  
  }
  @Test
  public void Logout() {
	  throw new SkipException("Under Construction");
// System.out.println("D Test Case");
  }
  
  @Test(priority='A',enabled=false)
  public void Home() {
	  System.out.println("C Test Case");
  }




}
