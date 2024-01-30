package PractiseTestNG;

import org.testng.annotations.Test;

public class example3 {
	@Test(priority=1)
	  public void signin() {
		  System.out.println("sign in successful");
	  }
	  @Test(priority=2)
	  public void login() {
		  System.out.println("login successful");
	  }
	  @Test(priority=3)
	  public void logout(){
		  System.out.println("logout successful");
	  }
	}


//if if dont set the priority to the methods then it will be executed in the alphabetical order.
//once we set the priority then the @test methods will we executed as per the given priority.