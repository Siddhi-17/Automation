package PractiseTestNG;

import org.testng.annotations.Test;

public class example4 {
	
	//enabled method
	@Test(priority=1,enabled=false)
	  public void signin() {
		  System.out.println("sign in successful");
	  }
	  @Test(priority=2)
	  public void login() {
		  System.out.println("login successful");
	  }
	  @Test(priority=3,enabled=false)
	  public void logout(){
		  System.out.println("logout successful");
	  }
	}


//enabled=true: means ,method is ready for execution (bydefault it is true).
//enabled=false; means method is not ready for the execution