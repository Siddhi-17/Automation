package Annotataions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotataions_Example2 {
	@BeforeTest
	public void openBrowser() {
		System.out.println("Chrome browser opened and app url is entered");
	}
	@Test(priority=1)
	public void verifyLogin() {
		System.out.println("Successfully login..");
	}	
	@AfterTest
	public void closeBrowser() {
		System.out.println("Browser instance is closed");
	}
	@Test(priority=2)
	public void createTask() {
		System.out.println("Task created Successfully");
	}
}
