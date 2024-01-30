package PractiseTestNG;

import org.testng.annotations.Test;

public class example6 {
	@Test(priority = 1, enabled = true)
	public void signin() {
		System.out.println("sign in successful");
	}

	@Test(priority = 2)
	public void login() throws InterruptedException {
		// Thread.sleep(3000);
		System.out.println("login successful");
	}

	@Test(priority = 3, timeOut = 2000)
	public void createPIM() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("PIM created successfully...");
	}

	@Test(priority = 4, dependsOnMethods = "createPIM")
	public void DeletePIM() {
		System.out.println("PIM deleted successfully");
	}

	@Test(priority = 5, expectedExceptions = ArithmeticException.class)
	public void checkNumber() {
		System.out.println("checked number..");
		int num = 20 / 0;
		System.out.println("division result is: " + num);
	}

	@Test(priority = 6, enabled = true)
	public void logout() {
		System.out.println("logout successful");
	}
}

//dependsOnMethods: use this when method is depends on another method successful execution

//expectedExceptions: use to handle any expected exception from test method.