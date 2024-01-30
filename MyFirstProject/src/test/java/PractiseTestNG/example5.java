package PractiseTestNG;

import org.testng.annotations.Test;

public class example5 {
	@Test(priority=1,enabled=true, description="first testcase is created",timeOut=2000)
	  public void signin() {
		  System.out.println("sign in successful");
	  }
	  @Test(priority=2, description="second testcase is created", invocationCount=3,timeOut=2000)
	  public void login() throws InterruptedException {
		  //Thread.sleep(3000);
		  System.out.println("login successful");
	  }
	  @Test(priority=3,enabled=false)
	  public void logout(){
		  System.out.println("logout successful");
	  }
	}



//DESCRIPRION:

//1) description is an additional argument that we can pass in the @test method.
//2) after passing the description argument in the @test method then the method will execute with the provided description.

//ENOCATIONCOUNT:

//enovocationCount: helps to execute same method multiple time based on the number given.

//timeOut:

//timeout: helps to finish the method in the given time




