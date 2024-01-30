package Annotataions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Example1 {
	@Test(priority = 1)
	public void signin() {
		System.out.println("google page is sign in successfully...");

	}

	@BeforeTest
	public void calling() {
		System.out.println("you are getting call from 23456789...");
	}

	@AfterTest
	public void ringing() {
		System.out.println("the phone is ringing.....");
	}

	@Test(priority = 2)
	public void login() {
		System.out.println("the page get login properly....");
	}

	@Test(priority = 3)
	public void logout() {
		System.out.println("the page get logout successfully...");
	}
}
