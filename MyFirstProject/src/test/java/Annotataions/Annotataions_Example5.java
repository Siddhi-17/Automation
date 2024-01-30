package Annotataions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotataions_Example5 {
  @Test
  public void first() {
	  System.out.println("hello 1");
  }
  @Test
  public void second() {
	  System.out.println("hello 2");
  }
  
  @Test
  public void third() {
	  System.out.println("hello 3");
  }
  @BeforeTest
  public void before() {
	  System.out.println("this is before test ..");
  }
  @AfterTest
  public void after() {
	  System.out.println("this is after test ..");
  }
  @BeforeMethod
  public void beforemethod() {
	  System.out.println("this is before method...");
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("this is after method...");
  }
}
