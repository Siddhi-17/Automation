package Annotataions;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class example11 {
	
 @BeforeSuite
  public void test1() {
	 System.out.println("*********Test1**********");
  }
 @AfterSuite
 public void test2(){
	 System.out.println("********test2*******");
 }
 @Test
 public void game1() {
	 System.out.println("This is the game");
 }
}
