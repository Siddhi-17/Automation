package Annotataions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotataions_Example4 {
  @Test(priority=2)
  public void Test1() {
	  System.out.println("this is testcase no.1");
  }
  @BeforeTest
  public void testsuit() {
	  System.out.println("testrail login successfully....");
  }
  @AfterTest
  public void testsuit1() {
	  System.out.println("testrail logout successfully...");
  }
  @Test(priority=1)
  public void Test2() {
	  System.out.println("this is testcase no.2");
  }
  @Test(priority=3)
  public void Test3() {
	  System.out.println("this is testcase no.3");
  }
}
