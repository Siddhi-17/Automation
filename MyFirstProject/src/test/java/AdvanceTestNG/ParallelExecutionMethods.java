package AdvanceTestNG;

import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class ParallelExecutionMethods extends SeleniumUtility{
  @Test
  public void testcase1() {
	  setUp("chrome","https://www.google.com");
	  cleanUp();
  }
  @Test
  public void testcase2() {
	  setUp("chrome","https://www.google.com");
	  cleanUp();
  }
  @Test
  public void testcase3() {
	  setUp("firefox","https://www.google.com");
	  cleanUp();
  }
}
