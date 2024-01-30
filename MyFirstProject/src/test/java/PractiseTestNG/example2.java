package PractiseTestNG;

import org.testng.annotations.Test;

public class example2 {
  @Test
  public void signin() {
	  System.out.println("sign in successful");
  }
  @Test
  public void login() {
	  System.out.println("login successful");
  }
  @Test
  public void logout(){
	  System.out.println("logout successful");
  }
}

//if we don't set the priority to the methods then it will be executed in the alphabetical order.